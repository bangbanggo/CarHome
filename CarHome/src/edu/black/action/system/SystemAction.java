package edu.black.action.system;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import edu.black.model.Authority;
import edu.black.model.Roles;
import edu.black.model.Users;
import edu.black.service.SystemService;
import edu.black.service.impl.SystemServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class SystemAction extends ActionSupport {
    private SystemService systemService = new SystemServiceImpl();
    private List<Authority> authorityList;
    private List<Roles> rolesList;
    private List<Users> usersList;
    private Users users;
    private Authority authority;
    private Roles roles;
    private int id;
    private String message;
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    /**
     * 展示权限列表
     * @return
     */
    public String listpur(){
        authorityList = systemService.queryAllAuthority(null);
        return SUCCESS;
    }

    /**
     * 展示角色列表
     * @return
     */
    public String listrole(){
        rolesList = systemService.queryAllRoles();
        return SUCCESS;
    }

    /**
     * 显示用户列表
     * @return
     */
    public String listuser(){
        usersList = systemService.queryAllUsers();
        return SUCCESS;
    }

    public String preaddrole(){
        authorityList = systemService.queryAllAuthority(2);
        return SUCCESS;
    }

    public String preadduser(){
        rolesList = systemService.queryAllRoles();
        return SUCCESS;
    }

    /**
     * 添加用户
     * @return
     */
    public String adduser(){
        if (systemService.addUsers(users)){
            return ERROR;
        }else {
            return SUCCESS;
        }
    }

    /**
     * 添加角色
     * @return
     */
    public String addrole(){
       if ( systemService.addRoles(roles)){
           return SUCCESS;
       }else {
           return ERROR;
       }

    }

    /**
     * 添加权限
     * @return
     */
    public String addpur(){
        if (systemService.addAuthority(authority)){
            return SUCCESS;
        }else {
            message = "添加失败";
            return ERROR;
        }

    }

    /**
     * 更新权限名
     * @return
     */
    public String updatepur(){
        if (systemService.updateAuthority(authority)){
            return SUCCESS;
        }else {
            return ERROR;
        }

    }

    public String updaterole(){
        if (systemService.updateRoles(roles)){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    public String updateuser(){
        if (systemService.updateUsers(users)){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    /**
     * 进入更新页面
     * @return
     */
    public String edituser(){
        rolesList = systemService.queryAllRoles();
        users = systemService.getUsers(id);
        return SUCCESS;
    }
    public String editrole(){
        authorityList = systemService.queryAllAuthority(2);
        roles = systemService.getRoles(id);
        return SUCCESS;
    }
    public String editpur(){
        authority = systemService.getAuthority(id);
        return SUCCESS;
    }

    /**
     * 批量删除用户
     * @return
     */
    public String deleteuser(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String[] idStrings = request.getParameterValues("ids");
        int[] idInts = new int[idStrings.length];
        for (int i=0;i<idStrings.length;i++){
            idInts[i] = Integer.parseInt(idStrings[i]);
        }
        systemService.deleteUsers(idInts);
        return SUCCESS;
    }

    /**
     * 批量删除权限
     * @return
     */
    public String deletepur(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String[] idStrings = request.getParameterValues("ids");
        if (idStrings==null || idStrings.length==0){
                return SUCCESS;
        }
        int[] idInts = new int[idStrings.length];
        for (int i=0;i<idStrings.length;i++){
            idInts[i] = Integer.parseInt(idStrings[i]);
        }
        systemService.deleteAuthority(idInts);
        return SUCCESS;
    }

    /**
     * 批量删除角色
     * @return
     */
    public String deleterole(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String[] idStrings = request.getParameterValues("ids");
        int[] idInts = new int[idStrings.length];
        for (int i=0;i<idStrings.length;i++){
            idInts[i] = Integer.parseInt(idStrings[i]);
        }
        systemService.deleteRoles(idInts);
        return SUCCESS;
    }


    /**
     * setter and getter
     */

    public SystemService getSystemService() {
        return systemService;
    }

    public void setSystemService(SystemService systemService) {
        this.systemService = systemService;
    }

    public List<Authority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<Authority> authorityList) {
        this.authorityList = authorityList;
    }

    public List<Roles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Roles> rolesList) {
        this.rolesList = rolesList;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
