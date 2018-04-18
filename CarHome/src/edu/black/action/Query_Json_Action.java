package edu.black.action;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.opensymphony.xwork2.ActionSupport;
import edu.black.service.CarService;
import edu.black.service.impl.CarServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class Query_Json_Action extends ActionSupport {
    private CarService carService = new CarServiceImpl();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
