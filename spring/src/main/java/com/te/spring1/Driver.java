package com.te.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Car c = (Car) applicationContext.getBean("cars");
		c.move();

	}
}
