package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Cars;
import edu.black.model.Orders;
import edu.black.service.CarService;
import edu.black.service.impl.CarServiceImpl;

import java.util.List;

public class OrderAction extends ActionSupport {
    private CarService carService = new CarServiceImpl();
    private Orders orders;
    private List<String> carnames;

    public String preadd(){
        carnames = carService.getAllCarNames();
        return "order";
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public List<String> getCarnames() {
        return carnames;
    }

    public void setCarnames(List<String> carnames) {
        this.carnames = carnames;
    }
}
