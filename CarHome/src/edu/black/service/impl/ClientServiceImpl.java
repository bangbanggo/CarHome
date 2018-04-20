package edu.black.service.impl;

import edu.black.dao.ClientsMapper;
import edu.black.model.Clients;
import edu.black.model.ClientsExample;
import edu.black.service.ClientService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientServiceImpl  implements ClientService {

    private SqlSessionFactory factory;
    private List<Clients> clientsList = null;
    private Clients client = null;

    public ClientServiceImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Clients clients) {

        //生成编号
        DateFormat df = new SimpleDateFormat("yyMMDD");
        String time = df.format(new Date());
        String sub = String.valueOf((int)Math.random()*1000);
        clients.setClientno(time+sub);
        SqlSession session = factory.openSession();
        ClientsMapper mapper = session.getMapper(ClientsMapper.class);
        boolean result = mapper.insertSelective(clients)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public boolean update(Clients clients) {
        SqlSession session = factory.openSession();
        ClientsMapper mapper = session.getMapper(ClientsMapper.class);
        boolean result = mapper.updateByPrimaryKeySelective(clients)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public edu.black.model.Clients getClient(Clients clients) {
        SqlSession session = factory.openSession();
        ClientsMapper mapper = session.getMapper(ClientsMapper.class);
        client = mapper.selectByPrimaryKey(clients.getClientid());
        session.close();
        return client;
    }
    @Override
    public List<Clients> queryall(Clients clients) {
        SqlSession session = factory.openSession();
        ClientsMapper mapper = session.getMapper(ClientsMapper.class);
        clientsList = mapper.selectByExample(null);
        session.close();
        return clientsList;
    }

    @Override
    public boolean delete(List<Clients> clientsList) {
        List<Integer> ids = new ArrayList<>();
        for (Clients clients:clientsList){
            ids.add(clients.getClientid());
        }
        SqlSession session = factory.openSession();
        ClientsMapper mapper = session.getMapper(ClientsMapper.class);
        ClientsExample example = new ClientsExample();
        example.createCriteria().andClientidIn(ids);
        mapper.deleteByExample(example);
        session.commit();
        session.close();
        return true;
    }
}
