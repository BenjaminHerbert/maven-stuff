package de.npng.poc.cd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

	@Test
	public void test() {
		TestPrinter p = new TestPrinter();
		p.print("fuuu");
		assertEquals("fuuu", p.sense);
	}
}