package com.te.staticanddefault;

public interface PhoneCall {

	void busyMessage();

	default void covidAlert() {
		System.out.println("bacchan speaking and telling us to stay safe");
	}
}
