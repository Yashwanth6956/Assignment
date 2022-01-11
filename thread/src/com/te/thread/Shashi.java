package com.te.thread;

public class Shashi extends Thread {
	Printer printer;

	public Shashi(Printer printer) {
		super();
		this.printer = printer;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("shashi is printing");
	}

}
