package edu.black.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class LoginInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String url = invocation.getProxy().getActionName();
        HttpSession session = ServletActionContext.getRequest().getSession();
        //获取用户输入的用户名
        String username = (String) session.getAttribute("username");
        System.out.println("正在验证..."+username);
        if(username!=null){
            return invocation.invoke();
        }else{
            return "error";
        }
    }
}
