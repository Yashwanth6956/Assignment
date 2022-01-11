package com.te.springAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MockRating {
	@Value("above avg")
	String result;
	@Value("60")
	int Theory;
	@Value("90")
	int Practical;
	public void setResult(String result) {
		this.result = result;
	}
	public void setTheory(int theory) {
		Theory = theory;
	}
	public void setPractical(int practical) {
		Practical = practical;
	}
	@Override
	public String toString() {
		return "MockRating [result=" + result + ", Theory=" + Theory + ", Practical=" + Practical + "]";
	}
	
	

}
