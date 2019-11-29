package org.examples;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 15;
		for (int i = 2; i <= number; i++) {
			if (findPrime(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean findPrime(int value) {
		int sqrt = (int) Math.sqrt(value);
		for (int i = 2; i < sqrt + 1; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

}
