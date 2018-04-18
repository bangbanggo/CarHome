package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Cars;
import edu.black.model.Store;
import edu.black.model.Warehouse;
import edu.black.service.CarService;
import edu.black.service.WarehouseService;
import edu.black.service.impl.CarServiceImpl;
import edu.black.service.impl.WarehouseServiceImpl;

import java.util.List;

public class CarAction extends ActionSupport {
    private CarService carService = new CarServiceImpl();
    private WarehouseService warehouseService = new WarehouseServiceImpl();
    private Cars car;
    private List<Warehouse> warehouseList;
    private Store store;
    private List<Cars> carsList;
    public String addCar(){
        if (carService.addCars(car,store)){
            return SUCCESS;
        } else return ERROR;
    }

    public String preAddCar(){
        warehouseList = warehouseService.queryAllWarehouse();
        return SUCCESS;
    }

    public String carDetail(){
        if (car!=null){
            if (car.getCarname()!=null &&car.getCarname().equals("")){
                car.setCarname(null);
            }
            if (car.getCarmodel()!=null &&car.getCarmodel().equals("")){
                car.setCarmodel(null);
            }
            if (car.getCarcolor()!=null && car.getCarcolor().equals("")){
                car.setCarcolor(null);
            }

        }else {
            car = new Cars();
        }
        warehouseList = warehouseService.queryAllWarehouse();
        carsList = carService.queryAllCarsDetails(car);
        return SUCCESS;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    public CarService getCarService() {
        return carService;
    }

    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    public List<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public WarehouseService getWarehouseService() {
        return warehouseService;
    }

    public void setWarehouseService(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<Cars> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<Cars> carsList) {
        this.carsList = carsList;
    }
}
