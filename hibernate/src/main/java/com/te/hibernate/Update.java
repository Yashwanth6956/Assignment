
package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		System.out.println("hello world");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		Team player = createEntityManager.find(Team.class, 11);
		System.out.println(player);

		// deleting the data
		Team find = createEntityManager.find(Team.class, 20);
		transaction.begin();
		createEntityManager.remove(find);
		transaction.commit();
		
		//updating data
		Team find2 = createEntityManager.find(Team.class, 21);
		if(find2!=null) {
			find2.setDesignation("vc");
			transaction.begin();
			transaction.commit();
			System.out.println("updated");
		}

	}

}
