package org.examples;

public class ReverseString {

	public static void main(String[] args) {
		String value = "Paiman";
		System.out.println(reverseString(value));
		System.out.println("\n");
		System.out.println(reverseString2(value));
	
	}

	private static String reverseString2(String value) {
		return new StringBuffer(value).reverse().toString();
	}

	private static String reverseString(String value) {
		String result = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			result += value.charAt(i);
		}
		return result;
	}

}
