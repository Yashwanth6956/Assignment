package com.te.assignment1;

public class Airport {
   String name;
   int noOfFlights;
   String terminals;
   Flights f;
public Airport(String name, int noOfFlights) {
	super();
	this.name = name;
	this.noOfFlights = noOfFlights;
}

public void setTerminals(String terminals) {
	this.terminals = terminals;
}

public void setF(Flights f) {
	this.f = f;
}
   
   
   public void start() {
	   f.takeOff();
	   System.out.println("Airport name  "  +name);
	   System.out.println("no of flight " +noOfFlights);
	   System.out.println("terminal " +terminals);
	   System.out.println("happy journey");
   }
   
 
	

}
