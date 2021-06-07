/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
/**
 *
 * @author parth
 */
public class firstServletJava implements Servlet{
   
   // Life Cycle method 
    
   ServletConfig conf;
   public void init(ServletConfig conf){
       this.conf = conf;
       System.out.println("Creating project......");
   }
   
   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
       System.out.println("Service.........");
       
       //set the content type of resopnse
       res.setContentType("text/html");
       
       PrintWriter out =  res.getWriter(); 
       out.println("<h1>this is my output from servlet method</h1>");
       out.println("<h1>Today date time: "+new Date().toString()+"</h1>");
   }
   
   public void destroy(){
       System.out.println("Destroy.........");
         
   }
   
   //non life cycle method
   public String getServletInfo(){
       return "Hello String getServletInfo";
   }
   
   public ServletConfig getServletConfig(){
       return this.conf;
   }
   
   
}
