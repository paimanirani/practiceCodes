package org.lint.practice;

/**
 * 
 * @author paiman
 * s=aba; 
 * n=10;
 * input=abaabaabaa
 * output=7(number of A's)
 *
 */

public class Ace {

	public static void main(String[] args) {
		// String a = "abcab";
		String a = "abcaca";
		// String a = "a";
		// long size = 100000000000l;
		long size = 10;
		long total = 0;

		long times = (long) size / a.length();
		long remainder = size % a.length();

		total = (aCounter(a, a.length()) * times) + aCounter(a, remainder);
		System.out.println(total);

	}

	private static long aCounter(String s, long end) {
		long result = 0;
		for (int i = 0; i < end; i++) {
			if (s.charAt(i) == 'a') {
				result++;
			}
		}
		return result;
	}
}