package com.te.Springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Pet {
	@Autowired
	Animal animal;
	
	public void doThings() {
		if(animal.isPet()) {
			animal.eat();
			animal.sound();
		}else {
			System.out.println("not a pet ");
		}
		
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
