package edu.black.service.impl;

import edu.black.dao.CarsMapper;
import edu.black.dao.StoreMapper;
import edu.black.model.*;
import edu.black.service.CarService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private SqlSessionFactory factory;
    private List<String> names;
    private List<Integer> ids;

    public CarServiceImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean addCars(Cars car, Store store) {
        SqlSession session = factory.openSession();
        CarsMapper mapper = session.getMapper(CarsMapper.class);
        boolean result = mapper.insertSelective(car)==1?true:false;
        if (!result) {
            session.rollback();
        }else {
            store.setCarid(car.getCarid());
            StoreMapper storeMapper = session.getMapper(StoreMapper.class);
            boolean rs = storeMapper.insertSelective(store)==1?true:false;
            if (!rs){
                session.rollback();
            }else {
                session.commit();
            }
        }
        session.close();
        return result;
    }

    @Override
    public List<Cars> queryAllCarsDetails(Cars cars) {
        List<Cars> list = null;
        SqlSession session = factory.openSession();
        CarsMapper mapper = session.getMapper(CarsMapper.class);
        list = mapper.selectCarsDetail(cars);
        session.close();
        return list;
    }

    @Override
    public List<Cars> querySomeCars(List<Cars> list) {
        SqlSession session = factory.openSession();
        CarsMapper mapper = session.getMapper(CarsMapper.class);
        CarsExample example = new CarsExample();
        List<Integer> ids = new ArrayList<>();
        for (Cars cars :list){
            ids.add(cars.getCarid());
        }
        example.createCriteria().andCaridIn(ids);

        list = mapper.selectByExample(example);
        return list;
    }



    @Override
    public boolean chagneWarehouse(Store store) {
        SqlSession session = factory.openSession();
        StoreMapper storeMapper = session.getMapper(StoreMapper.class);
        //先减少，再查，有更新，无插入

        int result = 0;
        result +=storeMapper.updateWarehouseold(store);
        if (storeMapper.check(store) >0){
            result+=storeMapper.updatewarehouse(store);
        }else {
            result+=storeMapper.insertstoreitem(store);
        }

        if (result==2){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return result==3?true:false;
    }

    @Override
    public Cars getOneCar(Store store) {
        Cars cars= null;
        SqlSession session = factory.openSession();
        CarsMapper mapper = session.getMapper(CarsMapper.class);
        cars = mapper.selectOneCar(store);
        session.close();
        return cars;
    }

    @Override
    public List<String> getAllCarNames() {
        SqlSession session = factory.openSession();
        CarsMapper carsMapper = session.getMapper(CarsMapper.class);
        names = carsMapper.getAllCarNames();
        session.close();
        return names;
    }

    @Override
    public List<String> getAllCarModel(String name) {
        SqlSession session = factory.openSession();
        CarsMapper carsMapper = session.getMapper(CarsMapper.class);
        names = carsMapper.getAllCarNames();
        session.close();
        return names;
    }

    @Override
    public List<Integer> getAllCarNoByModel(String model) {
        SqlSession session = factory.openSession();
        CarsMapper carsMapper = session.getMapper(CarsMapper.class);
        ids = carsMapper.getAllCarNoByModel(model);
        session.close();
        return ids;
    }

    @Override
    public List<Integer> getAllCarNoByName(String name) {
        SqlSession session = factory.openSession();
        CarsMapper carsMapper = session.getMapper(CarsMapper.class);
        ids = carsMapper.getAllCarNoByName(name);
        session.close();
        return ids;
    }
}
