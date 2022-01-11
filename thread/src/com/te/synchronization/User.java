package com.te.synchronization;

public class User extends Thread {
	TicketBooking t;
	int noOfTickets;
	String name;

	public User(TicketBooking t, int noOfTickets, String name) {
		super();
		this.t = t;
		this.noOfTickets = noOfTickets;
		this.name = name;
	}

	@Override
	public void run() {
		super.run();
		t.bookTickets(noOfTickets, name);

	}

}
