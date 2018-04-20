package edu.black.service;

import edu.black.model.Orders;

import java.util.List;

public interface OrderService {
    public boolean add(Orders order);
    public boolean update(Orders order);
    public Orders getClient(Orders order);
    public List<Orders> queryall(Orders order);
    public boolean delete(List<Orders> ordersList);
}
