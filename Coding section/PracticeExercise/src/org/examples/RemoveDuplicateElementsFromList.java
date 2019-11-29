package org.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {

	public static void main(String[] args) {
		List<String> stringValues = new ArrayList<>();
		stringValues.add("Hi");
		stringValues.add("Hello");
		stringValues.add("Bye");
		stringValues.add("Hi");

		List<Integer> intValues = new ArrayList<>();
		intValues.add(3);
		intValues.add(1);
		intValues.add(2);
		intValues.add(1);

		// distinct type 1
		System.out.println("\n distinct type 1: ");
		System.out.println(distinct1(stringValues));
		System.out.println(distinct1(intValues));

		// distinct type 2
		System.out.println("\n distinct type 2: ");
		System.out.println(distinct2(stringValues));
		System.out.println(distinct2(intValues));

		// sort type 1
		System.out.println("\n sort type 1: ");
		System.out.println(sort1(stringValues));
		System.out.println(sort1(intValues));

		// reverse sort type 1
		System.out.println("\n reverse sort type 1: ");
		System.out.println(reverseSort1(stringValues));
		System.out.println(reverseSort1(intValues));

		// sort type 2
		System.out.println("\n sort type 2: ");
		System.out.println(sort2(stringValues));
		System.out.println(sort2(intValues));

		// reverse sort type 2
		System.out.println("\n reverse sort type 2: ");
		System.out.println(reverseSort2(stringValues));
		System.out.println(reverseSort2(intValues));

		// sort type 3
		System.out.println("\n sort type 3: ");
		System.out.println(sort3(stringValues));
		System.out.println(sort3(intValues));

		// reverse sort type 3
		System.out.println("\n reverse sort type 3: ");
		System.out.println(reverseSort3(stringValues));
		System.out.println(reverseSort3(intValues));
	}

	private static <T> List<T> distinct1(List<T> values) {
		return values.stream().distinct().collect(Collectors.toList());
	}

	private static <T> List<T> distinct2(List<T> values) {
		Set<T> setValues = new HashSet<>(values);
		return new ArrayList<>(setValues);
	}

	private static <T> List<T> sort1(List<T> values) {
		return values.stream().sorted().collect(Collectors.toList());
	}

	private static <T> List<T> reverseSort1(List<T> values) {
		return values.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	}

	private static <T> List<T> sort2(List<T> values) {
		List<T> b = new ArrayList<>(values);
		// this works too!!!
		// Collections.sort((List) b);
		Collections.sort((List) b, Comparator.naturalOrder());
		return b;
	}

	private static <T> List<T> reverseSort2(List<T> values) {
		List<T> b = new ArrayList<>(values);
		Collections.sort(b, Collections.reverseOrder());
		return b;
	}

	private static <T extends Comparable<? super T>> List<T> sort3(List<T> values) {
		List<T> b = new ArrayList<>(values);
		b.sort((sa, sb) -> sa.compareTo(sb));
		return b;
	}

	private static <T extends Comparable<? super T>> List<T> reverseSort3(List<T> values) {
		List<T> b = new ArrayList<>(values);
		b.sort((sa, sb) -> sb.compareTo(sa));
		return b;
	}

}
