package br.inatel.ec.ec206.example.calculator;

public class Fibonacci {

	public int calcNumber(int value) {
		if (value <= 0) {
			throw new IllegalArgumentException("The value must be greater than zero.");
		}
		if (value == 1) {
			return value;
		}
		int fib = 1;
		int prevFib = 1;

		for (int i = 2; i < value; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}

}
