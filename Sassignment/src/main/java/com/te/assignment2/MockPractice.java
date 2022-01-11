package com.te.assignment2;

import org.springframework.beans.factory.annotation.Value;

public class MockPractice {
	@Value("good")
	String result;
	@Value("80")
	int theory;
	@Value("90")
	int practical;
	public void setResult(String result) {
		this.result = result;
	}
	public void setTheory(int theory) {
		this.theory = theory;
	}
	public void setPractical(int practical) {
		this.practical = practical;
	}
	@Override
	public String toString() {
		return "MockPractice [result=" + result + ", theory=" + theory + ", practical=" + practical + "]";
	}
	

}
