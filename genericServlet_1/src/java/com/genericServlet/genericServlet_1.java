
package com.genericServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class genericServlet_1 extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
       System.out.println("This is genericServlet Service method......");
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       out.println("<h1> This is genericServlet Service method...... </h1>");
       out.println("<h1>run generic servlet</h1>");
       
           
    }   
}
