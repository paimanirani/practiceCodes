package org.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ZeroSumSubarray {
	private static int total_sum;
	private static List<String> lists;

	// Driver Program to test above functions
	public static void main(String args[]) {
		total_sum = 0;
		lists = new ArrayList<>();
		int arr[] = { -3, 2, 3, 1, 6 };
		String subString = "";
		printAllSubsets(arr, total_sum, subString);
		List<String[]> unique = removeDuplicates();
		printList(unique);
	}

	private static void printList(List<String[]> unique) {
		System.out.println("Number of arrays that is equal to " + total_sum + " is: " + unique.size() + "\n");
		for (String[] unique_arr : unique) {
			for (String s : unique_arr) {
				System.out.print(s + " ");
			}
			System.out.println("\n");
		}

	}

	private static List<String[]> removeDuplicates() {
		List<String[]> al = new ArrayList<>();
		List<String[]> unRedundant = new ArrayList<>();
		for (String list : lists) {
			String[] values = list.split(" ");
			Arrays.sort(values);
			al.add(values);
		}
		Set<Integer> ignore = new HashSet<>();
		for (int i = 0; i < al.size() - 1; i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (Arrays.equals(al.get(i), al.get(j))) {
					ignore.add(j);
				}
			}
		}
		for (int i = 0; i < al.size(); i++) {
			if (!ignore.contains(i)) {
				unRedundant.add(al.get(i));
			}
		}
		return unRedundant;
	}

	private static void printAllSubsets(int[] arr, int sum, String subString) {
		if (sum < 0) {
			return;
		}
		if (sum == total_sum && subString == "") {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					int a = arr[i];
					int b = arr[j];
					int temp_result = sum - (a + b);
					String temp_SubString = subString + a + " " + b;
					if (temp_result == 0) {
						lists.add(temp_SubString.trim());
						continue;
					} else {
						int[] temp_arr = new int[arr.length - 2];
						int count = 0;
						for (int k = 0; k < arr.length; k++) {
							if (k != i && k != j) {
								temp_arr[count] = arr[k];
								count++;
							}
						}
						printAllSubsets(temp_arr, temp_result, temp_SubString);
					}
				}
			}

		}
		for (int x = 0; x < arr.length; x++) {
			int c = arr[x];
			int temp_result = sum - c;
			String temp_SubString = subString + " " + c;
			if (temp_result == 0) {
				lists.add(temp_SubString.trim());
				continue;
			} else {
				int[] temp_arr = new int[arr.length - 1];
				int count = 0;
				for (int k = 0; k < arr.length; k++) {
					if (k != x) {
						temp_arr[count] = arr[k];
						count++;
					}
				}
				printAllSubsets(temp_arr, temp_result, temp_SubString);
			}
		}

	}

}