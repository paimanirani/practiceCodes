package org.lint.practice;

import java.util.ArrayList;
import java.util.List;

public class MinimumJump {
	static void minJumps(int arr[]) {
		List<Integer> values = new ArrayList<>();
		int currentIndex = 0;
		int jump = 0;

		if (arr.length <= 1) {
			System.out.println("jump=" + 0);
			return;
		}
		// Return -1 if not possible to jump
		if (arr[0] == 0) {
			System.out.println("Impossible to jump");
			return;
		}
		while (currentIndex < arr.length - 1) {
			int maxIndex = -1;
			int newIndex = -1;
			values.add(arr[currentIndex]);
			for (int i = 1; i <= arr[currentIndex]; i++) {
				newIndex = currentIndex + i;
				if (maxIndex == -1) {
					maxIndex = newIndex;
				}

				if (newIndex + arr[newIndex] >= arr.length - 1) {
					values.add(arr[newIndex]);
					currentIndex = arr.length - 1;
					values.add(arr[currentIndex]);
					jump += 2;
					break;
				} else {
					if (arr[maxIndex] <= arr[newIndex]) {
						maxIndex = newIndex;
					}
				}
			}
			if (currentIndex != arr.length - 1) {
				currentIndex = maxIndex;
				jump++;
			}

		}

		System.out.println(values);
		System.out.println(jump);
		System.out.println("\n");

	}

	// Driver method to test the above function
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

		// calling minJumps method
		minJumps(arr);

		// example2
		arr = new int[] { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
		minJumps(arr);

		// example3
		arr = new int[] { 2, 1, 3, 2, 3, 4, 5, 1, 2, 8 };
		minJumps(arr);

	}

}