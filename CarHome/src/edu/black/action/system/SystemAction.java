package edu.black.action.system;

import com.opensymphony.xwork2.ActionSupport;
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
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    /**
     * 展示权限列表
     * @return
     */
    public String listpur(){
        authorityList = systemService.queryAllAuthority();
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

    /**
     * 添加用户
     * @return
     */
    public String adduser(){
        return SUCCESS;
    }

    /**
     * 添加角色
     * @return
     */
    public String addrole(){
        return SUCCESS;
    }


    /**
     * 更新
     * @return
     */
    public String updateuser(){
        users = systemService.getUsers(id);
        return SUCCESS;
    }
    public String updaterole(){
        roles = systemService.getRoles(id);
        return SUCCESS;
    }
    public String updatepur(){
        authority = systemService.getAuthority(id);
        return SUCCESS;
    }

    /**
     * 批量删除用户
     * @return
     */
    public String deleteusers(){
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
}
