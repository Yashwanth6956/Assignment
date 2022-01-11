package com.te.exception;

public class UnderAgeException extends Exception {
	UnderAgeException() {
		super("invalid age");
	}

	UnderAgeException(String message) {
		super(message);

	}
}
