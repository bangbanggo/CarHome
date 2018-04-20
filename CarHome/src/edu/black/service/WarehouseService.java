package edu.black.service;

import edu.black.model.Cars;
import edu.black.model.Warehouse;

import java.util.List;
import java.util.Map;

public interface WarehouseService {
    public List<Warehouse> queryAllWarehouse();
    public Warehouse getWarehouse(int id);
    public boolean addWarehouse(Warehouse warehouse);
    public boolean deleteWarehouse(List<Integer> ids);
    public boolean updateWarehouse(Warehouse warehouse);
    public List<Warehouse> queryAllCarsInWarehosue();
    public List<Warehouse> queryByCars(Cars cars);
    public List<Warehouse> queryByWarehouse(Warehouse warehouse);
    public List<Warehouse> queryByCarsOnlyWarehosue(Cars cars);
}
