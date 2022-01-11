package com.te.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		Laptop l = new Laptop();
		l.setLid(3);
		l.setName("del");
	

		Student s = new Student();
		s.setSid(102);
		s.setName("lakshman");
		s.getLaptop().add(l);

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("yash");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(s);
		createEntityManager.persist(l);
		transaction.commit();

	}

}
