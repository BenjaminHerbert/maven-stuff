package de.npng.poc.cd;

public class TestPrinter implements Printer {

	public String sense;

	public void print(String string) {
		sense = string;
	}

}