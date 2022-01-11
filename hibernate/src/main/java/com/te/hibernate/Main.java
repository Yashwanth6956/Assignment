package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("enter id");
			int id = s.nextInt();
			if (id == 0) {
				break;
			}
			System.out.println("enter name");
			String name = s.next();
			System.out.println("enter the salary");
			double salary = s.nextDouble();

			Employees employees = new Employees();
			employees.setEmpId(id);
			employees.setName(name);
			employees.setSalary(salary);

			EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("yash");
			EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();

			EntityTransaction transaction = createEntityManager.getTransaction();
//			Employees find = createEntityManager.find(Employees.class, 1);
//			System.out.println(find);

			transaction.begin();
			createEntityManager.persist(employees);
			transaction.commit();
		}
	}
}