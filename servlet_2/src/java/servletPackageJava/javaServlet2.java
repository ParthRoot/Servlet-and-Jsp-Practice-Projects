/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletPackageJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.ServletConfig;


/**
 *
 * @author parth
 */
public class javaServlet2 implements Servlet{
    
    ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf = conf;
    }
    
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
        System.out.println("Service for servlet 2................");
        
        //set content type response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>this is my second servlet project</h1>");
        out.println("<h1>DATE and TIME: "+new Date().getDate()+"/"+new Date().getMonth()+"/"+new Date().getYear()+"-"+new Date().getHours()+":"+new Date().getMinutes()+":"+new Date().getSeconds()+"</h1>");
            
       
          
    }
    
    public void destroy(){
        System.out.println("Servlet 2 destory.....................");
    }
    
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    public String getServletInfo(){
        return "this is servlet 2 infor";
    }
    
}
