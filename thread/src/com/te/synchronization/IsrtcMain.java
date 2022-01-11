package com.te.synchronization;

public class IsrtcMain {
	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking(10);

		User u1 = new User(ticketBooking, 10, "yash");
		User u2 = new User(ticketBooking, 5, "chandan");
		User u3 = new User(ticketBooking, 10, "ricky");

		u1.start();
		u2.start();
		u3.start();

	}

}
