package edu.black.action.warehouse;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Cars;
import edu.black.model.Warehouse;
import edu.black.service.WarehouseService;
import edu.black.service.impl.WarehouseServiceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WarehouseAction extends ActionSupport {
    private WarehouseService warehouseService = new WarehouseServiceImpl();
    private Warehouse warehouse;
    private List<Warehouse> warehouseList;
    private Set<String> names;
    private Cars car;

    public String preAddWarehouse(){
        return SUCCESS;
    }

    public String addWarehouse(){
        warehouseService.addWarehouse(warehouse);
        return SUCCESS;
    }

    public String listWarehouse(){
        warehouseList = warehouseService.queryAllWarehouse();
        return SUCCESS;
    }

    public String editWarehouse(){
        warehouse = warehouseService.getWarehouse(warehouse.getWarehouseid());
        return SUCCESS;
    }

    public String deleteWarehouse(){
        List<Integer> list = new ArrayList<>();
        for (Warehouse warehouse:warehouseList){
            list.add(warehouse.getWarehouseid());
        }
       if(warehouseService.deleteWarehouse(list)){
            return SUCCESS;
       }else {
            return ERROR;
       }
    }

    public String updateWarehouse(){
        if (warehouseService.updateWarehouse(warehouse)){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }


    public String listCars(){
        warehouseList = warehouseService.queryAllCarsInWarehosue();
        names = new HashSet<>();
        for (Warehouse warehouse:warehouseList){
            for (Cars cars:warehouse.getCars()){
                names.add(cars.getCarname());
            }
        }

        //如果为默认选项，这将其置空
        if (warehouse!=null && warehouse.getWarehouseid()==-1){
            warehouse = null;
        }
        if (car!=null&& car.getCarname().equals("-1")){
            if (car.getCarmodel()!=null){
                Cars temp = new Cars();
                temp.setCarmodel(car.getCarmodel());
                car = temp;
            }else {
                car = null;
            }
        }

        if (warehouse!=null &&warehouse.getWarehouseid()!=null){
            warehouseList = warehouseService.queryByWarehouse(warehouse);
        }if (car!=null &&(car.getCarname()!=null || car.getCarmodel()!=null)){
            warehouseList  = warehouseService.queryByCars(car);
        }
        return SUCCESS;
    }

    public WarehouseService getWarehouseService() {
        return warehouseService;
    }

    public void setWarehouseService(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public List<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(List<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }
}
