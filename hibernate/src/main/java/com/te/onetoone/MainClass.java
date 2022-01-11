package com.te.onetoone;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setGid(1);
		girl.setName("san");
		 
//		Girl girl2 = new Girl();
//		girl2.setGid(2);
//	girl2.setName("amala paul");

		Boy boy = new Boy();
		boy.setBid(101);
		boy.setName("vishal");
		
		Boy boy2 = new Boy();
		boy2.setBid(102);
	    boy2.setName("mani");
	    
	    Boy boy3 = new Boy();
	    boy3.setBid(103);
	    boy3.setName("praveen");

       List<Boy> listOfBoys = Arrays.asList(boy,boy2,boy3);
       girl.setBoys(listOfBoys);
       boy.setGirl(girl);
       boy2.setGirl(girl);
       boy3.setGirl(girl);


		

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("map");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(girl);
		createEntityManager.persist(boy);
		createEntityManager.persist(boy2);
		createEntityManager.persist(boy3);
		
		transaction.commit();

	}

}
