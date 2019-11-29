package org.examples;

public class Fibonacci {

	public static void main(String[] args) {
		int size = 10;
		// one way
		getFibonacciSeries(size);
		System.out.println("\n");

		// another way
		for (int i = 1; i <= size; i++) {
			System.out.println(getFibonacciSeriesRecursion(i));
		}

	}

	private static int getFibonacciSeriesRecursion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return getFibonacciSeriesRecursion(number - 1) + getFibonacciSeriesRecursion(number - 2);

	}

	private static void getFibonacciSeries(int size) {
		int i = 1;
		int previous = 0;
		int current = 1;
		System.out.println(current);
		while (i != size) {
			int value = previous + current;
			System.out.println(value);
			previous = current;
			current = value;
			i++;
		}

	}

}
