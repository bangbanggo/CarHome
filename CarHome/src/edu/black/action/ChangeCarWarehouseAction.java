package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Cars;
import edu.black.model.Store;
import edu.black.model.Warehouse;
import edu.black.service.CarService;
import edu.black.service.WarehouseService;
import edu.black.service.impl.CarServiceImpl;
import edu.black.service.impl.WarehouseServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ChangeCarWarehouseAction extends ActionSupport {
    private CarService carService = new CarServiceImpl();
    private WarehouseService warehouseService = new WarehouseServiceImpl();
    private Store store;
    private List<Warehouse> warehouseList;
    private List<Cars> cars;
    private String choice;

    @Override
    public String execute() throws Exception {
        carService.chagneWarehouse(store);
        return SUCCESS;
    }

    public String preChange(){
        if (choice!=null){
            String[] ids = choice.split("/");
            if (ids.length==2){
                store = new Store();
                store.setCarid(Integer.parseInt(ids[0]));
                store.setWarehouseid(Integer.parseInt(ids[1]));
            }
            cars = new ArrayList<>();
            cars.add(carService.getOneCar(store));
            warehouseList = warehouseService.queryAllWarehouse();
        }
        return SUCCESS;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
