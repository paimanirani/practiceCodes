package org.examples;

public class Factorial {

	public static void main(String[] args) {
		int number = 4;
		System.out.println(getFactorial(number));

	}

	private static int getFactorial(int number) {
		if (number == 1) {
			return 1;
		}
		return number * getFactorial(number - 1);
	}

}
