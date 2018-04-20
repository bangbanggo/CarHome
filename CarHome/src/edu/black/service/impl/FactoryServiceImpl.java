package edu.black.service.impl;

import edu.black.dao.FactoriesMapper;
import edu.black.model.Factories;
import edu.black.model.FactoriesExample;
import edu.black.service.FactoryService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FactoryServiceImpl implements FactoryService {

    private SqlSessionFactory factory;
    private List<Factories> factoriesList = null;
    private Factories client = null;

    public FactoryServiceImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Factories factories) {
        SqlSession session = factory.openSession();
        FactoriesMapper mapper = session.getMapper(FactoriesMapper.class);
        boolean result = mapper.insertSelective(factories)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public boolean update(Factories factories) {
        SqlSession session = factory.openSession();
        FactoriesMapper mapper = session.getMapper(FactoriesMapper.class);
        boolean result = mapper.updateByPrimaryKeySelective(factories)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public Factories getFactory(Factories factories) {
        SqlSession session = factory.openSession();
        FactoriesMapper mapper = session.getMapper(FactoriesMapper.class);
        client = mapper.selectByPrimaryKey(factories.getFactoryid());
        session.close();
        return client;
    }
    @Override
    public List<Factories> queryall(Factories factories) {
        SqlSession session = factory.openSession();
        FactoriesMapper mapper = session.getMapper(FactoriesMapper.class);
        FactoriesExample example = new FactoriesExample();
        if (factories!=null){
            if (factories.getFactoryname()!=null){
                example.createCriteria().andFactorynameLike("%" + factories.getFactoryname() + "%");
            }
            if (factories.getFactoryaddress()!=null){
                example.createCriteria().andFactoryaddressLike("%" + factories.getFactoryaddress() + "%");
            }
        }
        factoriesList = mapper.selectByExample(example);
        session.close();
        return factoriesList;
    }

    @Override
    public boolean delete(List<Factories> factoriesList) {
        List<Integer> ids = new ArrayList<>();
        for (Factories factories:factoriesList){
            ids.add(factories.getFactoryid());
        }
        SqlSession session = factory.openSession();
        FactoriesMapper mapper = session.getMapper(FactoriesMapper.class);
        FactoriesExample example = new FactoriesExample();
        example.createCriteria().andFactoryidIn(ids);
        mapper.deleteByExample(example);
        session.commit();
        session.close();
        return true;
    }
}
