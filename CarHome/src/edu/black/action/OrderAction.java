package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Cars;
import edu.black.model.Clients;
import edu.black.model.Orders;
import edu.black.service.CarService;
import edu.black.service.ClientService;
import edu.black.service.OrderService;
import edu.black.service.impl.CarServiceImpl;
import edu.black.service.impl.ClientServiceImpl;
import edu.black.service.impl.OrderServiceImpl;

import java.util.List;

public class OrderAction extends ActionSupport {
    private CarService carService = new CarServiceImpl();
    private ClientService clientService = new ClientServiceImpl();
    private OrderService orderService = new OrderServiceImpl();
    private Orders order;
    private List<String> carnames;
    private List<Clients> clientsList;
    private List<Orders> ordersList;

    public String preadd(){
        carnames = carService.getAllCarNames();
        clientsList = clientService.queryall(null);
        return "order";
    }


    public String add(){
        orderService.add(order);
        return SUCCESS;
    }

    public String list(){
        if (order!=null){
            ordersList =  orderService.queryall(order);
        }else {
            ordersList =  orderService.queryall(null);
        }

        return "list";
    }

    public String delete(){
        orderService.delete(ordersList);
        return list();
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public List<String> getCarnames() {
        return carnames;
    }

    public void setCarnames(List<String> carnames) {
        this.carnames = carnames;
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }
}
