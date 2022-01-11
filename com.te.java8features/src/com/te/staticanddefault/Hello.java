package com.te.staticanddefault;

public class Hello {
	public static void main(String[] args) {
		PhoneCall call = new Maharashtra();
		PhoneCall call1 = new TamilNadu();
		PhoneCall call2 = new Karnataka();

		call.busyMessage();
		call1.busyMessage();
		call2.busyMessage();

		System.out.println("==============================");

		call.covidAlert();
		call1.covidAlert();
		call2.covidAlert();

	}

}
