package com.te.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet {
	
	   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		   
	Integer i=	Integer.parseInt( req.getParameter("num1"));
	Integer j=	Integer.parseInt( req.getParameter("num2")); 
	
	PrintWriter writer = resp.getWriter();
	writer.println("sum of two num is=  "+(i+j));
		 
		   
		   
		    
		    }

}
