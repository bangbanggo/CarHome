package edu.black.service.impl;

import edu.black.dao.WarehouseMapper;
import edu.black.model.Cars;
import edu.black.model.Warehouse;
import edu.black.model.WarehouseExample;
import edu.black.service.WarehouseService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {
    private SqlSessionFactory factory;

    public WarehouseServiceImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Warehouse> queryAllWarehouse() {
        List<Warehouse> list = null;
        SqlSession session = factory.openSession();
        WarehouseMapper warehouseMapper = session.getMapper(WarehouseMapper.class);
        list= warehouseMapper.selectByExample(null);
        session.close();
        return list;
    }

    @Override
    public Warehouse getWarehouse(int id) {
        SqlSession session = factory.openSession();
        WarehouseMapper mapper = session.getMapper(WarehouseMapper.class);
        Warehouse warehouse = mapper.selectByPrimaryKey(id);
        session.close();
        return warehouse;
    }

    @Override
    public boolean addWarehouse(Warehouse warehouse) {
        warehouse.setWarehouseremainstore(0);
        SqlSession session = factory.openSession();
        WarehouseMapper warehouseMapper = session.getMapper(WarehouseMapper.class);
        boolean result = warehouseMapper.insertSelective(warehouse)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public boolean deleteWarehouse(List<Integer> ids) {
        SqlSession session = factory.openSession();
        WarehouseMapper warehouseMapper = session.getMapper(WarehouseMapper.class);
        WarehouseExample example = new WarehouseExample();
        example.createCriteria().andWarehouseidIn(ids);
        warehouseMapper.deleteByExample(example);
        session.commit();
        session.close();
        return true;
    }

    @Override
    public boolean updateWarehouse(Warehouse warehouse) {
        SqlSession session = factory.openSession();
        WarehouseMapper warehouseMapper = session.getMapper(WarehouseMapper.class);
        boolean result = warehouseMapper.updateByPrimaryKeySelective(warehouse)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public List<Warehouse> queryAllCarsInWarehosue() {
        List<Warehouse> list = null;
        SqlSession session = factory.openSession();
        WarehouseMapper warehouseMapper = session.getMapper(WarehouseMapper.class);
        list= warehouseMapper.selectCarsInWarehouse();
        session.close();
        return list;
    }

    @Override
    public List<Warehouse> queryByCars(Cars car) {
        List<Warehouse> list = null;
        SqlSession session = factory.openSession();
        WarehouseMapper mapper = session.getMapper(WarehouseMapper.class);
        list = mapper.selectByCars(car);
        session.close();
        return list;
    }

    @Override
    public List<Warehouse> queryByWarehouse(Warehouse warehouse) {
        List<Warehouse> list = null;
        SqlSession session = factory.openSession();
        WarehouseMapper mapper = session.getMapper(WarehouseMapper.class);
        list = mapper.selectByWarehouse(warehouse);
        session.close();
        return list;
    }
}
