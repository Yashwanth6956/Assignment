package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Myclass {
	public static void main(String[] args) {
		Team player = new Team();
		System.out.println("Hello World!");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter player id ");
			int id = sc.nextInt();
			if (id == 0) {
				break;
			}
			player.setEid(id);
			System.out.println("enter player name");
			String name = sc.next();
			player.setName(name);
			System.out.println("enter salary");
			int salary = sc.nextInt();
			player.setSalary(salary);
			System.out.println("enter designation");
			String designation = sc.next();

			player.setDesignation(designation);
			player.setEid(id);
			player.setName(name);
			player.setSalary(salary);
			player.setDesignation(designation);
		}

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = emf.createEntityManager();
		EntityTransaction transcation = createEntityManager.getTransaction();
		transcation.begin();
		createEntityManager.persist(player);

		transcation.commit();
	}
}
