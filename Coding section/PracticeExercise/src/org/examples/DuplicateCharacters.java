package org.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String input = "Paiman Irani Ba";
		if (getDuplicateCharacters(input) == null || getDuplicateCharacters(input).isEmpty()) {
			System.out.println("No duplicate letters found in \"" + input + "\"");
		} else {
			System.out.println(getDuplicateCharacters(input));
		}
	}

	private static List<String> getDuplicateCharacters(String input) {
		input = input.trim().toLowerCase().replace(" ", "");
		Map<String, Integer> blah = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			String letter = String.valueOf(input.charAt(i));
			if (blah.containsKey(letter)) {
				blah.put(letter, blah.get(letter) + 1);
			} else {
				blah.put(letter, 1);
			}
		}

		Set<Entry<String, Integer>> entrySet = blah.entrySet();
		List<String> output = new ArrayList<>();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				output.add(entry.getKey());
			}
		}
		return output;
	}

}