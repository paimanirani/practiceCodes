package org.general;

public class AlternateStackValues {
	public static void main(String[] args) {
		MyStack<Integer> MyStack = new MyStack<>();
		StringBuilder result = new StringBuilder();
		String[] input = { "1", "2", "3", "4" };
		for (String s : input) {
			MyStack.push(Integer.parseInt(s));
		}

		for (int i = 0; i < input.length; i++) {
			if ((i % 2) == 0) {
				result.append(' ').append(MyStack.pop());
			} else {
				MyStack.pop();
			}
		}

		System.out.println(result.substring(1));
	}
}