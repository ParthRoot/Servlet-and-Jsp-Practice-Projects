
package com.genericServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class genericServlet_2 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException{
        System.out.println("genericServlet_2");
        
        res.setContentType("text/html");
        PrintWriter p1 = res.getWriter();
        p1.println("<h1>genericServlet_2</h1>");
         
    }
}
