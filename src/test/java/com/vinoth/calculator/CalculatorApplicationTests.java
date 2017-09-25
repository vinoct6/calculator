package com.vinoth.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


public class CalculatorApplicationTests {

	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
