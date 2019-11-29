/*
 * 
 * Map Every number to letter, for example if you type ABCD it should return 0123
 */
package org.general;

public class LetterToNumConversion {
	public static void main(String[] args) {

		String input = "abcd";
		if (input.matches("[a-z]*")) {

			char[] arr = input.toLowerCase().toCharArray();
			for (char c : arr) {
				int value = c - 97;
				System.out.print(value);
			}
		}

		else {
			System.out.println("none");
		}
	}
}
