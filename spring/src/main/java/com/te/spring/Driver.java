package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		Engine e= (Engine) applicationContext.getBean("eng");
//		e.start();
		
		
		Car c=(Car) applicationContext.getBean("car");
		c.move();
		
	   
	}

}
