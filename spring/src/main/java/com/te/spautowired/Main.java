package com.te.spautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Laptop bean = applicationContext.getBean(Laptop.class);
		System.out.println(bean);
		bean.test();

	}

}
