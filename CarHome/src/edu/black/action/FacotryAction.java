package edu.black.action;

import com.opensymphony.xwork2.ActionSupport;
import edu.black.model.Factories;
import edu.black.service.FactoryService;
import edu.black.service.impl.FactoryServiceImpl;

import java.util.List;

public class FacotryAction extends ActionSupport {
    private FactoryService factoryService = new FactoryServiceImpl();
    private Factories factory;
    private List<Factories> factoryList;


    public String preadd(){
        return "add";
    }

    public String add(){
        if (factoryService.add(factory)){
            return "list";
        }else {
            return ERROR;
        }
    }

    public String edit(){
        factory = factoryService.getFactory(factory);
        return "update";
    }

    public String update(){
        if(factoryService.update(factory)){
            return "list";
        }else {
            return ERROR;
        }
    }

    public String list(){
        if (factory!=null){
            if (factory.getFactoryname()!=null && !factory.getFactoryname().replace(" ","").equals("")){
                factoryList = factoryService.queryall(factory);
            }else {
                factory.setFactoryname(null);
            }
            if (factory.getFactoryaddress()!=null&& !factory.getFactoryaddress().replace(" ","").equals("")){
                factoryList = factoryService.queryall(factory);
            }else {
                factory.setFactoryaddress(null);
            }
        }else {
            factoryList = factoryService.queryall(null);
        }
        return SUCCESS;
    }


    public String delete(){
        factoryService.delete(factoryList);
        return "list";
    }

    public Factories getFactory() {
        return factory;
    }

    public void setFactory(Factories factory) {
        this.factory = factory;
    }

    public List<Factories> getFactoryList() {
        return factoryList;
    }

    public void setFactoryList(List<Factories> factoryList) {
        this.factoryList = factoryList;
    }
}
