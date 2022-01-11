package com.te.thread;

public class BoyFriend extends Thread {
	Account account;

	public BoyFriend(Account account) {
		super();
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 100; i++) {
			account.deposit(200);
		}
		System.out.println("boy friend completed deposit");

	}
}
