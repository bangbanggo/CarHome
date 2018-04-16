package edu.black.service.impl;

import edu.black.dao.AuthorityMapper;
import edu.black.dao.RolesMapper;
import edu.black.dao.UsersMapper;
import edu.black.model.*;
import edu.black.service.SystemService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
        return false;
    }

    @Override
    public boolean addUsers(Users users) {
        return false;
    }

    @Override
    public boolean addRoles(Roles roles) {
        return false;
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
        return false;
    }

    @Override
    public boolean deleteUsers(int[] ids) {
        return false;
    }

    @Override
    public boolean deleteRoles(int[] ids) {
        return false;
    }

    @Override
    public Users getUsers(int id) {
        return null;
    }

    @Override
    public Authority getAuthority(int id) {
        return null;
    }

    @Override
    public Roles getRoles(int id) {
        return null;
    }

    @Override
    public List<Users> queryAllUsers() {
        return null;
    }

    @Override
    public List<Authority> queryAllAuthority() {
        SqlSession session = factory.openSession();
        AuthorityMapper mapper =  session.getMapper(AuthorityMapper.class);

        List<Authority> list = mapper.selectByExample(null);
        session.close();
        return list;
    }

    @Override
    public List<Roles> queryAllRoles() {
        return null;
    }

    @Override
    public boolean updateUsersRoles(Usersrole usersrole) {
        return false;
    }

    @Override
    public boolean updateRolesAuthority(Rolesauthority rolesauthority) {
        return false;
    }
}
