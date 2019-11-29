package org.examples;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {
		String name = "Better Butter";
		Map<Character, Integer> values = new HashMap<Character, Integer>();
		name = name.replace(" ", "").trim().toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (values.containsKey(name.charAt(i))) {
				values.put(name.charAt(i), values.get(name.charAt(i)) + 1);
			} else {
				values.put(name.charAt(i), 1);
			}
		}
		System.out.println("\n:Ascending:");
		Map<Character, Integer> asc = values.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		asc.entrySet().iterator().forEachRemaining(System.out::println);

		System.out.println("\n:Descending:");
		Map<Character, Integer> desc = values.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		desc.entrySet().iterator().forEachRemaining(System.out::println);
	}
}
