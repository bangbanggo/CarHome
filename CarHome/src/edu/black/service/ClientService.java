package edu.black.service;


import edu.black.model.Clients;

import java.util.List;

public interface ClientService {
    public boolean add(Clients client);
    public boolean update(Clients client);
    public Clients getClient(Clients client);
    public List<Clients> queryall(Clients client);
    public boolean delete(List<Clients> clientsList);
}
