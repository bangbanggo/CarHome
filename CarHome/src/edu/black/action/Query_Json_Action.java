package edu.black.action;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.opensymphony.xwork2.ActionSupport;
import edu.black.dao.AuthorityMapper;
import edu.black.model.Authority;
import edu.black.model.Cars;
import edu.black.model.Warehouse;
import edu.black.service.CarService;
import edu.black.service.SystemService;
import edu.black.service.WarehouseService;
import edu.black.service.impl.CarServiceImpl;
import edu.black.service.impl.SystemServiceImpl;
import edu.black.service.impl.WarehouseServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Query_Json_Action extends ActionSupport {
    private CarService carService = new CarServiceImpl();
    private WarehouseService warehouseService = new WarehouseServiceImpl();
    private SystemService systemService = new SystemServiceImpl();
    private String name;
    public String getmodel(){
        String newname = null;
        try {
            newname = new String(name.getBytes("ISO8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        List<String> names = carService.getAllCarModel(newname);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().print(new Gson().toJson(names));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

 public String getcarno(){
        String newname = null;
        try {
            newname = new String(name.getBytes("ISO8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        List<Integer> names = carService.getAllCarNoByModel(newname);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().print(new Gson().toJson(names));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void getWwarehousebyCarModel(){
        List<Warehouse> list = null;
        Cars car = new Cars();
        car.setCarmodel(name);
        list = warehouseService.queryByCarsOnlyWarehosue(car);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().print(new Gson().toJson(list));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkCarNo(){
        Cars car = carService.checkCarNo(name);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().print(new Gson().toJson(car));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getMenu(){
        List<Authority> list = systemService.getTopMenu();
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().print(new Gson().toJson(list));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
