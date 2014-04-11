package de.npng.poc.cd;

public class Calculator {

	private Printer p;

	public Calculator() {
	}

	public Calculator(Printer p) {
		this.p = p;
	}

	public int add(int i, int j) {
		printIfPossible(String.format("%d + %d = %d", i,j,i+j));
		return i+j;
	}

	public int divide(int i, int j) {
		printIfPossible(String.format("%d / %d = %d", i,j,i/j));
		return i/j;
	}

	private void printIfPossible(String format) {
		if (p == null) return;
		p.print(format);
	}
}
