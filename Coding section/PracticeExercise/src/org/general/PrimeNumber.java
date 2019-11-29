/*
 * @author: Rishabh Agarwal
 * 
 * 
 * Find the prime Number
 * 
 */

package org.general;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int input, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		input = sc.nextInt();

		// for a number to be prime it should be divisible only by itself
		if (input == 1) {
			System.out.println("Not Prime");
		} else {
			boolean prime = true;
			for (i = 2; i < input; i++) {
				if (input % i == 0) {
					prime = false;
				}

			}
			if (prime) {
				System.out.println("The number is prime");
			} else {
				System.out.println("The number is not prime");
			}
		}

	}

}
