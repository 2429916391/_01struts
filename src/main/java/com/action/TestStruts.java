package com.action;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 2429916391@qq.com on 2017/2/20 10:42.
 */
public class TestStruts {
    public void execute() throws IOException {
        HttpServletResponse res = ServletActionContext.getResponse();
        res.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print("struts 入门okok");
        out.flush();
        out.close();
        System.out.println("Struts 入门");
    }
}
