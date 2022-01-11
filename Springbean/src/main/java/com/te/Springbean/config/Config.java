package com.te.Springbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.Springbean.Dog;
import com.te.Springbean.Pet;
import com.te.Springbean.Praveen;
import com.te.Springbean.Vamshi;



public class Config {
	
	@Bean("Dog")
	@Primary
	public Dog isDog() {
		return new Dog();
	}
	@Bean("praveen")
	public Praveen isPraveen() {
		return new Praveen();
	}
	
	@Bean("vamsi")
	public Vamshi isVamshi() {
		return new Vamshi();
	}
	
	@Bean
	
	public Pet isPet() {
		return new Pet();
	}
	

}
