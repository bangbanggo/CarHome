package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Clients;
import edu.black.service.ClientService;
import edu.black.service.impl.ClientServiceImpl;

import java.util.List;

public class ClientAction extends ActionSupport {
    private ClientService clientService = new ClientServiceImpl();
    private Clients client;
    private List<Clients> clientList;

    public String preadd(){
        return "add";
    }

    public String add(){
        if (clientService.add(client)){
            return "list";
        }else {
            return ERROR;
        }
    }

    public String edit(){
        client = clientService.getClient(client);
        return "update";
    }

    public String update(){
        if(clientService.update(client)){
            return "list";
        }else {
            return ERROR;
        }
    }

    public String list(){
        clientList = clientService.queryall(null);
        return SUCCESS;
    }


    public String delete(){
        clientService.delete(clientList);
        return "list";
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public List<Clients> getClientList() {
        return clientList;
    }

    public void setClientList(List<Clients> clientList) {
        this.clientList = clientList;
    }
}
