package org.general;

public class LowestIndexNumber {

	public static void main(String[] args) {
		int[] array = { 5, 8, 2, 6, 1, 9, 3 };
		int lowest = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowest) {
				lowest = array[i];
				index = i;
			}
		}
		System.out.println(index);
	}
}