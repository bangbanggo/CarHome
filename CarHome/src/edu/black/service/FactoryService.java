package edu.black.service;


import edu.black.model.Factories;
import edu.black.model.Factories;

import java.util.List;

public interface FactoryService {
    public boolean add(Factories factory);
    public boolean update(Factories factory);
    public Factories getFactory(Factories factory);
    public List<Factories> queryall(Factories factory);
    public boolean delete(List<Factories> factorysList);
}
