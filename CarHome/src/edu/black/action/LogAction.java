package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Menu;
import edu.black.model.Users;
import edu.black.service.Authentication;
import edu.black.service.SystemService;
import edu.black.service.impl.AuthenticatoinImpl;
import edu.black.service.impl.SystemServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class LogAction extends ActionSupport {
    private Authentication authentication = new AuthenticatoinImpl();
    private SystemService systemService = new SystemServiceImpl();
    private Users user;
    private String message;
    private Menu menu;
    public String login(){
        user = authentication.login(user);
        if (user==null){
            return ERROR;
        }
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("username",user.getUseraccessname());
        session.setAttribute("userid",user.getUserid());
        user = null;
        return SUCCESS;
    }

    public String logout(){
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.removeAttribute("username");
        session.invalidate();
        return SUCCESS;
    }
    public String check(){
        String username = (String)ServletActionContext.getRequest().getSession().getAttribute("username");
        Integer userid = (Integer)ServletActionContext.getRequest().getSession().getAttribute("userid");
        if (username==null||userid==null){
            message = "未登录，请刷新界面登录。";
            return ERROR;
        }else {
            menu = systemService.getMenuByUser(userid,username);
            return SUCCESS;
        }

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
