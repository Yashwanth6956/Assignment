package com.te.crud.doa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

@Repository
public class saveData {

	private EntityManager getP() {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("yash");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		return createEntityManager;
	}

	public boolean save(Employees emp) {
		try {
			EntityManager p = getP();
			EntityTransaction transaction = p.getTransaction();
			transaction.begin();
			p.persist(emp);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean remove(int id) {
		try {
			EntityManager p = getP();
			EntityTransaction transaction = p.getTransaction();
			transaction.begin();
			Employees find = p.find(Employees.class, id);
			p.remove(find);
            transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean update(int id,String firstName) {
		try {
			EntityManager p = getP();
			EntityTransaction transaction = p.getTransaction();
			transaction.begin();
			Employees find = p.find(Employees.class, id);
		    find.setFirstName(firstName);
		    transaction.commit();
		    return true;
		} catch (Exception e) {
			return false;
		}
		
		
		
	}

}
