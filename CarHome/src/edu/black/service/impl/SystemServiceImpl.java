package edu.black.service.impl;

import edu.black.dao.*;
import edu.black.model.*;
import edu.black.service.SystemService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class SystemServiceImpl implements SystemService {
    private SqlSessionFactory factory;
    private AuthorityMapper authorityMapper;
    private UsersMapper usersMapper;
    private RolesMapper rolesMapper;

    public SystemServiceImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addAuthority(Authority authority) {
        SqlSession session  = factory.openSession();
        AuthorityMapper mapper = session.getMapper(AuthorityMapper.class);
        boolean result = mapper.insertSelective(authority)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public boolean addUsers(Users users) {
        SqlSession session = factory.openSession();
        UsersMapper usersMapper = session.getMapper(UsersMapper.class);
        usersMapper.insertSelective(users);
        UsersroleMapper usersroleMapper = session.getMapper(UsersroleMapper.class);
        for (Roles roles:users.getRoles()){
            Usersrole usersrole = new Usersrole();
            usersrole.setRoleid(roles.getRoleid());
            usersrole.setUserid(users.getUserid());
            usersroleMapper.insert(usersrole);
        }
        session.commit();
        session.close();
        return false;
    }

    @Override
    public boolean addRoles(Roles roles) {
        SqlSession session = factory.openSession();
        RolesMapper mapper = session.getMapper(RolesMapper.class);
        mapper.insert(roles);
        RolesauthorityMapper rolesauthorityMapper= session.getMapper(RolesauthorityMapper.class);
        for (Authority authority:roles.getAuthorities()){
            Rolesauthority rolesauthority = new Rolesauthority();
            rolesauthority.setRoleid(roles.getRoleid());
            rolesauthority.setAuthorityid(authority.getAuthorityid());
            rolesauthorityMapper.insert(rolesauthority);
        }
        session.commit();
        session.close();
        return true;
    }

    @Override
    public boolean editAuthority(Authority authority) {
        return false;
    }

    @Override
    public boolean editUsers(Users users) {
        return false;
    }

    @Override
    public boolean editRoles(Roles roles) {
        return false;
    }

    @Override
    public boolean deleteAuthority(int[] ids) {
        SqlSession session = factory.openSession();
        AuthorityMapper mapper = session.getMapper(AuthorityMapper.class);
        for (int id:ids){
            mapper.deleteByPrimaryKey(id);
        }
        session.commit();
        session.close();
        return true;
    }

    @Override
    public boolean deleteUsers(int[] ids) {
        List<Integer> idList = new ArrayList<>();
        for (int id:ids){
            idList.add(id);
        }
        SqlSession session = factory.openSession();
        UsersroleMapper usersroleMapper = session.getMapper(UsersroleMapper.class);
        UsersroleExample example = new UsersroleExample();
        UsersroleExample.Criteria criteria =  example.createCriteria();
        criteria.andUseridIn(idList);
        usersroleMapper.deleteByExample(example);
        UsersMapper usersMapper = session.getMapper(UsersMapper.class);
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUseridIn(idList);
        usersMapper.deleteByExample(usersExample);
        session.commit();
        session.close();
        return true;
    }

    @Override
    public boolean deleteRoles(int[] ids) {
        List<Integer> idList = new ArrayList<>();
        for (int id:ids){
            idList.add(id);
        }
        SqlSession session = factory.openSession();
        RolesauthorityMapper rolesauthorityMapper = session.getMapper(RolesauthorityMapper.class);
        RolesauthorityExample example = new RolesauthorityExample();
        RolesauthorityExample.Criteria criteria =  example.createCriteria();
        //where roleid in (?,?,?,?)
        criteria.andRoleidIn(idList);
        rolesauthorityMapper.deleteByExample(example);
        session.commit();
        session.close();
        return true;
    }

    @Override
    public Users getUsers(int id) {
        SqlSession session = factory.openSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users user  = mapper.selectByPrimaryKey(id);
        session.close();
        return user;
    }

    @Override
    public Authority getAuthority(int id) {
        SqlSession session = factory.openSession();
        AuthorityMapper mapper  = session.getMapper(AuthorityMapper.class);
        Authority authority =  mapper.selectByPrimaryKey(id);
        session.close();
        return authority;
    }

    @Override
    public Roles getRoles(int id) {
        SqlSession session = factory.openSession();
        RolesMapper mapper = session.getMapper(RolesMapper.class);
        Roles roles = mapper.selectByPrimaryKey(id);
        session.close();
        return roles;
    }

    @Override
    public List<Users> queryAllUsers() {
        SqlSession session = factory.openSession();
        UsersMapper usersMapper = session.getMapper(UsersMapper.class);
        List<Users> list = usersMapper.selectByExample(null);

        //构建权限列表
        for (Users user:list){
            Map<Integer,Authority> map = new HashMap<>();
            for (Roles roles:user.getRoles()){
                for (Authority authority:roles.getAuthorities()){
                    map.put(authority.getAuthorityid(),authority);
                }
            }
            for (int i:map.keySet()){
                user.getAuthorities().add(map.get(i));
            }
        }

        session.close();
        return list;
    }

    @Override
    public List<Authority> queryAllAuthority(Integer level) {
        SqlSession session = factory.openSession();
        AuthorityMapper mapper =  session.getMapper(AuthorityMapper.class);
        AuthorityExample example = new AuthorityExample();
        example.setOrderByClause("authoritylevel");
        if (level!=null){
            example.createCriteria().andAuthoritylevelEqualTo(level);
        }
        List<Authority> list = mapper.selectByExample(example);
        session.close();
        return list;
    }

    @Override
    public List<Roles> queryAllRoles() {
        SqlSession session = factory.openSession();
        RolesMapper mapper =  session.getMapper(RolesMapper.class);
        List<Roles> list = mapper.selectByExample(null);
        session.close();
        return list;
    }

    @Override
    public boolean updateUsersRoles(Usersrole usersrole) {
        return false;
    }

    @Override
    public boolean updateRolesAuthority(Rolesauthority rolesauthority) {
        return false;
    }

    @Override
    public boolean updateAuthority(Authority authority) {
        SqlSession session = factory.openSession();
        AuthorityMapper mapper = session.getMapper(AuthorityMapper.class);
        boolean result = mapper.updateByPrimaryKey(authority)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public boolean updateRoles(Roles roles) {
        SqlSession session = factory.openSession();
        RolesMapper mapper = session.getMapper(RolesMapper.class);
        mapper.updateByPrimaryKey(roles);
        List<Integer> list = new ArrayList<>();
        list.add(roles.getRoleid());
        RolesauthorityMapper rolesauthorityMapper= session.getMapper(RolesauthorityMapper.class);
        RolesauthorityExample example = new RolesauthorityExample();
        example.createCriteria().andRoleidIn(list);
        rolesauthorityMapper.deleteByExample(example);
        for (Authority authority:roles.getAuthorities()){
            Rolesauthority rolesauthority = new Rolesauthority();
            rolesauthority.setRoleid(roles.getRoleid());
            rolesauthority.setAuthorityid(authority.getAuthorityid());
            rolesauthorityMapper.insert(rolesauthority);
        }
        session.commit();
        session.close();
        return true;
    }

    @Override
    public boolean updateUsers(Users users) {
        SqlSession session = factory.openSession();
        UsersMapper usersMapper = session.getMapper(UsersMapper.class);
        if (usersMapper.updateByPrimaryKeySelective(users)==1){
            UsersroleMapper usersroleMapper = session.getMapper(UsersroleMapper.class);
            UsersroleExample example = new UsersroleExample();
            List<Integer> list = new ArrayList<>();
            list.add(users.getUserid());
            example.createCriteria().andUseridIn(list);
            if (usersroleMapper.deleteByExample(example)>0){
                boolean result = true;
                for (Roles roles:users.getRoles()){
                    Usersrole usersrole = new Usersrole();
                    usersrole.setUserid(users.getUserid());
                    usersrole.setRoleid(roles.getRoleid());
                    if (usersroleMapper.insertSelective(usersrole)!=1){
                        session.rollback();
                        result = false;
                        break;
                    }
                }
                if (result){
                    session.commit();
                }
            }else {
                session.rollback();
            }
        }else {
            session.rollback();
        }
        return true;
    }

    @Override
    public Menu getMenuByUser(int userid, String username) {
        Users user = null;
        Menu menu = null;
        SqlSession session = factory.openSession();
        UsersMapper  mapper = session.getMapper(UsersMapper.class);
        UsersExample example = new UsersExample();
        example.createCriteria().andUseraccessnameEqualTo(username);
        example.createCriteria().andUseridEqualTo(userid);
        List<Users> list = mapper.selectByExample(example);
        if (list.size()==1){
            user = list.get(0);
            Set<Integer> ids = new HashSet<>();
            for (Roles roles:user.getRoles()){
                for (Authority authority:roles.getAuthorities()){
                    ids.add(authority.getAuthorityparentid());
                }
            }

            List<Integer> idslist = new ArrayList<>();
            for (Integer id:ids){
                idslist.add(id);
            }
                AuthorityMapper authorityMapper = session.getMapper(AuthorityMapper.class);
            AuthorityExample authorityExample = new AuthorityExample();
            authorityExample.createCriteria().andAuthorityidIn(idslist);
            List<Authority> MainMenu = authorityMapper.selectByExample(authorityExample);
            menu = new Menu(user,MainMenu);
        }
        session.close();
        return menu;
    }

    @Override
    public List<Authority> getTopMenu() {
        SqlSession session = factory.openSession();
        AuthorityMapper mapper = session.getMapper(AuthorityMapper.class);
        List<Authority> list = mapper.selectTopMenu();
        session.close();
        return list;
    }
}
