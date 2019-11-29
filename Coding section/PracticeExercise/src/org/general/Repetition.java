package org.general;

/*
 * 
 * Find the longest repeating substring
 */

public class Repetition {

	// A utility function to fill lps[] or compute
	// prefix funcrion used in KMP string matching
	// algorithm. Refer
	// https://www.geeksforgeeks.org/archives/11902
	// for details
	static void computeLPSArray(String str, int M, int lps[]) {

		int j = 0;

		int i;

		lps[0] = j; // lps[0] is always 0
		i = 1;

		// the loop calculates lps[i]
		// for i = 1 to M-1
		while (i < M) {
			if (str.charAt(i) == str.charAt(j)) {
				j++;
				lps[i] = j;
				i++;
			} else {
				if (j != 0) {
					// This is tricky. Consider the
					// example AAACAAAA and i = 7.
					j = lps[j - 1];

				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
	}

	static void isRepeat(String str) {
		// Find length of string and create
		// an array to store lps values used in KMP
		int n = str.length();
		int lps[] = new int[n];

		// Preprocess the pattern (calculate lps[] array)
		computeLPSArray(str, n, lps);

		// Find length of longest suffix
		// which is also prefix of str.
		int len = lps[n - 1];
		int r = n % (n - len);
		if (len > 0 && r == 0) {
			System.out.println("Word: " + str + " Number of repetitions: " + n / (n - len));
		} else {
			System.out.println("No repititions");
		}

	}

	// Driver program to test above function
	public static void main(String[] args) {
		// String txt[] = { "ABCABC", "ABABAB", "ABCDABCD", "GEEKSFORGEEKS", "GEEKGEEK",
		// "AAAACAAAAC", "ABCDABC" };
		// int n = txt.length;
		// for (int i = 0; i < n; i++) {
		// isRepeat(txt[i]);
		//
		// }
		isRepeat("AAACAAAC");

	}
}