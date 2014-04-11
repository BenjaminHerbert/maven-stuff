package de.npng.poc.cd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	@Test
	public void mainTest() throws Exception {
		Calculator c = new Calculator();
		assertEquals(11, c.add(5,6));
	}

}
