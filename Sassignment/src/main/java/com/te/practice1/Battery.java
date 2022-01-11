package com.te.practice1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Battery {

	public void charging() {
		System.out.println("battery is charging");
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("assig.xml");
		Laptop bean = applicationContext.getBean(Laptop.class);

		bean.on();

	}
}
