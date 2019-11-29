package org.examples;

public class Palindrome {

	public static void main(String[] args) {
		// numbers
		int number = 11011;
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}

		// string
		String word = "sapa";
		String result = palindrome(word);
		System.out.println("word: " + word + "\nresult: " + result);
		if (word.equals(result)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	private static boolean isPalindrome(int number) {
		int value = number;
		int reverse = 0;
		while (value != 0) {
			int remainder = value % 10;
			reverse = reverse * 10 + remainder;
			value = value / 10;
		}

		if (number == reverse) {
			return true;
		}
		return false;
	}

	private static String palindrome(String word) {
		if (word.length() == 1) {
			return word;
		}
		return (palindrome(word.substring(1))) + (word.charAt(0));
	}

}
