package com.te.synchronization;

public class TicketBooking {
	int tickets ;
	

	public TicketBooking(int tickets) {
		super();
		this.tickets = tickets;
	}


	public void bookTickets(int noOfTickets, String name) {
		System.out.println("login successfull");
		System.out.println("hello:" + name);
		synchronized (this) {
			if (tickets < noOfTickets) {
				System.out.println("Tickets are unavailable");
				System.out.println("======================================");

			} else {
				System.out.println("Tickets booked");
				tickets -= noOfTickets;
				System.out.println("no of tickets booked:" + tickets);
				System.out.println("=====================================");
			}

			System.out.println("Thank you ");
		}

	}
}