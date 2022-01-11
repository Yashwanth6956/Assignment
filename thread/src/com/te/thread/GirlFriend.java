package com.te.thread;

public class GirlFriend extends Thread {
	Account account;

	public GirlFriend(Account account) {
		super();
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <=10; i++) {
			account.deposit(10);
		}
		System.out.println("girl friend completed deposit");
	}

}
