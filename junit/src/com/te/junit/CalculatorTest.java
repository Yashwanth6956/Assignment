package com.te.junit;

import static org.junit.jupiter.api.Assertions.*;	

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//test instance creates the object of calculator test and void before all meathod is calledS
@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	void init() {
		calculator = new Calculator();
	}
//this meathod is used to execute before all the test meathods
	@BeforeAll
	void beforeAll() {
		System.out.println("executes before all test");
	}
	
	@Test
	@Disabled
	void add() {
		Calculator calculator = new Calculator();
		int actual = calculator.add(5, 7);
		int expected = 12;
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Multiplication")

	public void multiply() {
		int actual = Calculator.multiply(7, 2);
		assertEquals(14, actual);
	}

	@Test
	@DisplayName("division exception")
	public void divide() {
	assertThrows(ArithmeticException.class, ()->calculator.division(10, 0));
	}

}
