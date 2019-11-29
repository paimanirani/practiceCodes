package org.lint.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Given s string, Find max size of a sub-string, in which no duplicate chars
 * present.
 * 
 * @author paima
 *
 */
public class MaxSizeSubString {

	public static void main(String[] args) {
		String name = "Hi Betr Butter Grqofj";

		String[] words = name.split(" ");
		int indexMax = -1;
		boolean notDup = false;
		for (int i = 0; i < words.length; i++) {
			notDup = true;
			List<Character> letters = new ArrayList<>();
			for (int j = 0; j < words[i].length(); j++) {
				if (letters.contains(words[i].charAt(j))) {
					notDup = false;
					break;
				} else {
					letters.add(words[i].charAt(j));
				}
			}
			if (notDup) {
				if (indexMax == -1) {
					indexMax = i;
				} else if (words[indexMax].length() < words[i].length()) {
					indexMax = i;
				}
			}
		}

		if (indexMax == -1) {
			System.out.println("None");
		} else {
			System.out.println(words[indexMax]);
		}
	}
}
