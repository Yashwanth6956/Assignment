package com.te.assignment2;

import org.springframework.beans.factory.annotation.Autowired;

public class Salary {
	@Autowired
	MockPractice mockPractise;

	public void setMockPractise(MockPractice mockPractise) {
		this.mockPractise = mockPractise;
	}

	@Override
	public String toString() {
		return "Salary [mockPractise=" + mockPractise + "]";
	}
	

}
