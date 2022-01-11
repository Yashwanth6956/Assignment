package com.te.thread;

public class Printer {
int print;

public Printer(int print) {
	super();
	this.print = print;
}

synchronized public void doPrinting(int pages) {
	print=print+pages;
	
	
	
}
public void totalPages() {
	System.out.println(print);
}
	
}
