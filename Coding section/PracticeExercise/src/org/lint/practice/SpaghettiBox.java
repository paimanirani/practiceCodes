package org.lint.practice;
/**
 * Not Correct yet, need to work on it.
 * Also, takes lot of time.
 * @author paima
 *
 */
//total = 300, numbers from 1-299, add numbers that sum up to 300 = 1
//if not possible, return -1. From the above example, the maximum number is 299, 
//and we cannot sum up to 300 with one number. 

// 300 299 1
// 300 299 2 
// 300 100 3 
// 300 101 3 
// 7 300 3 
// 5 300 3 
// 3 300 1 
// 3 300 2 
// 298 150 2 
// 299 150 2 
// 300 150 2 
// 300 300 300 
// 300 300 3 
// 300 300 2 
// 300 300 1 
// 1 1 1 
// 299 300 24 
// 300 300 23 

//Output
// -1
// 299 1
// -1
// 99 100 101
// 4 1 2
// -1
// 3
// 2 1
// 148 150
// 149 150
// -1
// -1
// 297 1 2
// 299 1
// 300
// 1
// -1
// 47 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
// -1
// 24 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23

public class SpaghettiBox {

	public static void main(String[] args) {

		long sticks = 300;
		long storeCarries = 101;
		int boxes = 3;

		long[] bonetrousle = bonetrousle(sticks, storeCarries, boxes);
		for (int i = 0; i < bonetrousle.length; i++) {
			System.out.println(bonetrousle[i] + " ");
		}
	}

	static long[] bonetrousle(long n, long k, int b) {

		if (b == 1) {
			if (n == 1) {
				return new long[] { 1 };
			} else {
				return new long[] { -1 };
			}

		} else {
			long[] values = new long[b];
			for (int i = 0; i < b; i++) {
				values[i] = i + 1;
			}

			for (int i = b - 1; i >= 0; i--) {
				int sum = 0;

				sum = findSum(values);
				if (sum == n) {
					return values;
				}

				if (values[i] < (k - b) + (i + 1) && values[b - 1] == k) {
					long value = values[i];
					for (int q = i; q < b; q++) {
						value++;
						values[q] = value;
					}
					i = b - 1;
				}
				
				

				while (values[i] < (k - b) + (i + 1)) { // values[i] < k doesn't work?
					sum = findSum(values);
					if (sum == n) {
						return values;
					} else if (sum > n) {
						values[i] = (k - b) + (i + 1);
					} else {
						values[i] += 1;
					}
				}

			}

		}
		return new long[] { -1 };
	}
	private static int findSum(long[] arr) {
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		return sum;
	}

}