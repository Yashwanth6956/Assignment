package com.te.Springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import com.te.Springbean.config.Config2;



public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config2.class);
		Pet pet = ac.getBean(Pet.class);
		pet.doThings();
		
	}

}
