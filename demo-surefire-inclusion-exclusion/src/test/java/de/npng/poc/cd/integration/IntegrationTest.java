package de.npng.poc.cd.integration;

import de.npng.poc.cd.Calculator;
import de.npng.poc.cd.TestPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

	@Test
	public void test() {
		TestPrinter p = new TestPrinter();
		Calculator c = new Calculator(p);
		c.add(10, 20);
		assertEquals("10 + 20 = 30", p.sense);
	}

}
