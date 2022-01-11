package com.te.springLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class MyClass {
	public static void main(String[] args) {
//		ConfigurableApplicationContext cab=new AnnotationConfigApplicationContext(Config.class);
//		Demo bean = (Demo) cab.getBean("demo");
//		bean.name();
//		cab.close();
		
		AbstractApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		ac.registerShutdownHook();
		Demo bean = (Demo) ac.getBean("demo");
		bean.name();
		System.out.println(bean.hashCode());
	}

}
