package edu.black.service;

import edu.black.model.Cars;
import edu.black.model.Store;
import edu.black.model.Warehouse;

import java.util.List;

public interface CarService {
    public boolean addCars(Cars car, Store store);
    public List<Cars> queryAllCarsDetails(Cars cars);
    public List<Cars> querySomeCars(List<Cars> list);
    public boolean chagneWarehouse(Store store);
    public Cars getOneCar(Store store);
    public List<String> getAllCarNames();
    public List<String> getAllCarModel(String name);
    public List<Integer> getAllCarNoByModel(String model);
    public List<Integer> getAllCarNoByName(String name);
}
