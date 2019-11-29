package org.general;

public class Cryptography {

	public static void main(String[] args) {
		int key = 4;
		String value = "CatAndMouse";
		String encrypted = encrypt(key, value);
		System.out.println(encrypted);
		String decrypted = decrypt(key, encrypted);
		System.out.println(decrypted);
	}

	private static String decrypt(int key, String value) {
		char[] array = value.toCharArray();
		int[] encryption = new int[value.length()];
		String output = "";
		for (int i = 0; i < value.length(); i++) {
			int a = array[i];
			encryption[i] = a - key;
			output += (char) encryption[i];
		}
		return output;
	}

	private static String encrypt(int key, String value) {
		char[] array = value.toCharArray();
		int[] encryption = new int[value.length()];
		String output = "";
		for (int i = 0; i < value.length(); i++) {
			int a = array[i];
			encryption[i] = a + key;
			output += (char) encryption[i];
		}
		return output;
	}

}
