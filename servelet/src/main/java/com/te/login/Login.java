package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = res.getWriter();
		// writer.println("<h1> welcome boss </h1>");
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("pawd");
	

		writer.println("welcome  " + parameter);

		String[] parameterValues = req.getParameterValues("sports");
		for (String s : parameterValues) {
			writer.println(s);
		}

		

	}

}
