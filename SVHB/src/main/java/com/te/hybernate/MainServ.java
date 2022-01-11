package com.te.hybernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.emp.Employee;

public class MainServ extends HttpServlet {
	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
	Employee employee = new Employee();
	String parameter3 = req.getParameter("eid");
	String parameter = req.getParameter("uname");
	String parameter2 = req.getParameter("pawd");
	employee.setName(parameter);
	employee.setPassword(parameter2);
	int i = Integer.parseInt(parameter3);
	employee.setId(i);
	PrintWriter writer = resp.getWriter();

	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("new");
	EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();	
	transaction.begin();
	createEntityManager.persist(employee);
	transaction.commit();
	
//	createEntityManagerFactory.close();
//	createEntityManager.close();
}
	}
