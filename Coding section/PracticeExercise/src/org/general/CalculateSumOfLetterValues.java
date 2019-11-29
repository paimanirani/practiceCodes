package org.general;

public class CalculateSumOfLetterValues {

	public static void main(String[] args) {
		String input = "123456 abc+efg";
		String[] values = input.split(" ");
		char[] numbers = values[0].toCharArray();
		char[] characters = values[1].toCharArray();
		String operator = "";
		int op_index = 0;
		// find index
		for (int i = 0; i < numbers.length; i++) {
			if (!Character.isAlphabetic(characters[i])) {
				operator = String.valueOf(characters[i]);
				op_index = i;
			}
		}
		// Display link
		int i = 0;
		for (int j = 0; j < characters.length; j++) {
			if (j == op_index) {
				j++;
			}
			System.out.print(characters[j] + ":" + numbers[i] + " ");
			i++;
		}
		System.out.println("\n");

		// divide characters and integers into 2 sets (before and after operator)
		String r1 = values[1].substring(0, op_index);
		String r2 = values[1].substring(op_index + 1, values[1].length());
		int a = Integer.parseInt(values[0].substring(0, op_index));
		int b = Integer.parseInt(values[0].substring(op_index, values[0].length()));
		System.out.println(
				r1 + "" + operator + "" + r2 + " = " + a + "" + operator + "" + b + " = " + calculate(a, b, operator));

	}

	public static int calculate(int a, int b, String operator) {
		int result = 0;
		switch (operator) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		}
		return result;
	}
}
