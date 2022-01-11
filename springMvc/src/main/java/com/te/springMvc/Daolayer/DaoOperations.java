package com.te.springMvc.Daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.te.springMvc.model.Register;

@Component
public class DaoOperations {
	
	public boolean save(Register reg) {
		try {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("details");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
	    createEntityManager.persist(reg);
	    transaction.commit();
	    return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

}
