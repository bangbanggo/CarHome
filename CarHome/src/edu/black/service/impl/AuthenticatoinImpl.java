package edu.black.service.impl;

import edu.black.dao.AuthorityMapper;
import edu.black.dao.RolesMapper;
import edu.black.dao.UsersMapper;
import edu.black.model.Users;
import edu.black.model.UsersExample;
import edu.black.service.Authentication;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AuthenticatoinImpl implements Authentication {
    private SqlSessionFactory factory;

    public AuthenticatoinImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Users login(Users user) {
        SqlSession session = factory.openSession();
        UsersMapper usersMapper = session.getMapper(UsersMapper.class);
        UsersExample example = new UsersExample();
        example.createCriteria().andUseraccessnameEqualTo(user.getUseraccessname());
        example.createCriteria().andUseraccesspasswordEqualTo(user.getUseraccesspassword());
        List<Users> usersList = usersMapper.selectByExample(example);
        if (usersList.size()==1){
            user = usersList.get(0);
        }else {
            user = null;
        }
        session.close();
        return user;
    }
}
