package edu.black.service.impl;

import edu.black.dao.OrdersMapper;
import edu.black.dao.StoreMapper;
import edu.black.model.Orders;
import edu.black.model.OrdersExample;
import edu.black.model.Store;
import edu.black.service.OrderService;
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

public class OrderServiceImpl implements OrderService {
    private SqlSessionFactory factory;
    private List<Orders> orders = null;

    public OrderServiceImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean add(Orders order) {

        //生成编号
        DateFormat df = new SimpleDateFormat("yMMDD");
        String time = df.format(new Date());
        String sub = String.valueOf((int)(Math.random()*1000));
        order.setOrderid(Integer.parseInt(sub));
        //给默认订单状态
        order.setOrderstatus("已下单");
        SqlSession session = factory.openSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);
        boolean result = mapper.insertSelective(order)==1?true:false;
        if (result){
            Store store = new Store();
            store.setWarehouseid(order.getCar().getWarehouseid());
            store.setCarid(order.getCar().getCarid());
            store.setAmount(order.getOrderamount());
            StoreMapper storeMapper = session.getMapper(StoreMapper.class);
            //减去购买车的数量
            result = storeMapper.updateOrderInStore(store)==1?true:false;
            if (result){
                session.commit();
            }else {
                session.rollback();
            }
        }else {
            session.rollback();
        }
        session.close();
        return result;
    }

    @Override
    public boolean update(Orders order) {
        SqlSession session = factory.openSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);
        boolean result = mapper.updateByPrimaryKeySelective(order)==1?true:false;
        session.commit();
        session.close();
        return result;
    }

    @Override
    public edu.black.model.Orders getClient(Orders order) {
        SqlSession session = factory.openSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);
        order = mapper.selectByPrimaryKey(order.getOrderid());
        session.close();
        return order;
    }
    @Override
    public List<Orders> queryall(Orders order) {
        SqlSession session = factory.openSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);
        if (order!=null &&(order.getCar()==null ||order.getCar().getCarname()==null)){
            OrdersExample example = new OrdersExample();
            List list = new ArrayList();
            if (order.getOrderid()!=null&&order.getOrderid()!=0){
                list.add(order.getOrderid());
                example.createCriteria().andOrderidIn(list);
            }
            if (order.getOrdercreatedate()!=null && !order.getOrdercreatedate().equals("")){
                list.add(order.getOrdercreatedate());
                example.createCriteria().andOrdercreatedateIn(list);
            }
            if (order.getOrderclientid()!=null && order.getOrderclientid()!=0){
                list.add(order.getOrderclientid());
                example.createCriteria().andOrdercreatedateIn(list);
            }
            orders = mapper.selectByExample(example);
        }else if (order!=null && order.getCar()!=null && order.getCar().getCarname()!=null){
            orders = mapper.selectOrdersByCarName(order.getCar().getCarname());
        }else {
            orders = mapper.selectByExample(null);
        }
        session.close();
        return orders;
    }

    @Override
    public boolean delete(List<Orders> orderList) {
        List<Integer> ids = new ArrayList<>();
        for (Orders order:orderList){
            ids.add(order.getOrderid());
        }
        SqlSession session = factory.openSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);
        OrdersExample example = new OrdersExample();
        example.createCriteria().andOrderidIn(ids);
        mapper.deleteByExample(example);
        session.commit();
        session.close();
        return true;
    }
}
