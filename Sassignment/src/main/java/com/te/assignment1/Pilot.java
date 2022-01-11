package com.te.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pilot {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("assig.xml");
		Airport bean = (Airport) applicationContext.getBean("air");
		bean.start();
	}

}
