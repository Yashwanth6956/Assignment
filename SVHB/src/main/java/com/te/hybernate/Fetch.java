package com.te.hybernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.emp.Employee;

public class Fetch extends HttpServlet {
	

	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("un");
		String password = req.getParameter("pw");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("new");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		String query = " from Employee where name=:ab ";
		transaction.begin();
		Query createQuery = createEntityManager.createQuery(query);
		createQuery.setParameter("ab", name);
		
		transaction.commit();
		PrintWriter writer = resp.getWriter(); 

		Employee singleResult=null;
		try {
			singleResult = (Employee) createQuery.getSingleResult();

		} catch (Exception e) {
			writer.println("<h1>aaee guldu your not registed</h1>");
		}
		if (singleResult.getName().equals(name) && singleResult.getPassword().equals(password)) {
			writer.println("login successful");
		} else {
			writer.println("invalid uname");
		}
	}

}
