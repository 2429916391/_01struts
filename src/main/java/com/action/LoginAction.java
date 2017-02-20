package com.action;

import lombok.Data;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

/**
 * Created by 2429916391@qq.com on 2017/2/20 13:37.
 */
@Data
public class LoginAction {
    private String account;
    private String pass;
    public String execute(){
        if("admin".equalsIgnoreCase(account)&&"123".equals(pass)){
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("user","admin");
            return "success";
        }else {
            if(account==null || "".equals(account)){
                ServletActionContext.getContext().put("acc","账号必须填写");
            }else if(pass==null || "".equals(pass)){
                ServletActionContext.getContext().put("acc","密码必须填写");
            }else{
                ServletActionContext.getContext().put("acc","账号密码错误");
            }
            return "fail";
        }
    }
}
