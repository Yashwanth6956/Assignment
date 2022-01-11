package com.te.runtimexception;

public class UnderAgeException extends RuntimeException {
	UnderAgeException() {
		super("invalid age");
	}

	UnderAgeException(String message) {
		super();
	}

}
