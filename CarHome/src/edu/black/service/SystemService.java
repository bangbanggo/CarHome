package edu.black.service;

import edu.black.model.*;

import java.util.List;

public interface SystemService {
    /**
     * 添加
     * @param authority
     * @return
     */
    public boolean addAuthority(Authority authority);
    public boolean addUsers(Users users);
    public boolean addRoles(Roles roles);

    /**
     * 编辑
     * @param authority
     * @return
     */
    public boolean editAuthority(Authority authority);
    public boolean editUsers(Users users);
    public boolean editRoles(Roles roles);

    /**
     * 删除
     */
    public boolean deleteAuthority(int[] ids);
    public boolean deleteUsers(int[] ids);
    public boolean deleteRoles(int[] ids);

    /**
     * 获得某一个对象信息
     * @param id
     * @return
     */
    public Users getUsers(int id);
    public Authority getAuthority(int id);
    public Roles getRoles(int id);

    /**
     * 获得列表
     * @return
     */
    public List<Users> queryAllUsers();
    public List<Authority> queryAllAuthority(Integer level);
    public List<Roles> queryAllRoles();

    /**
     * 更新表关系
     * @param usersrole
     * @return
     */
    public boolean updateUsersRoles(Usersrole usersrole);
    public boolean updateRolesAuthority(Rolesauthority rolesauthority);

    /**
     * 更新表信息
     * @param authority
     * @return
     */
    public boolean updateAuthority(Authority authority);
    public boolean updateRoles(Roles Roles);
    public boolean updateUsers(Users Users);

    public Menu getMenuByUser(int userid,String username);
    public List<Authority> getTopMenu();

}
