package org.general;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 1, 4, 2, 9 };
		Sorting sort = new Sorting();
//		sort.selectionSort(arr);
		sort.insertionSort(arr);
		sort.printArray(arr);

	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public int[] selectionSort(int[] arr) {
		int n = arr.length;
		int minIndex = -1;
		for (int i = 0; i < n - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				swap(arr, i, minIndex);
			}
		}

		return arr;
	}

	public int[] insertionSort(int[] arr) {
		int n = arr.length;
		int j;
		int key;
		for (int i = 0; i < n; i++) {
			j = i - 1;
			key = arr[i];
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		return arr;
	}

	private void swap(int[] arr, int i, int minIndex) {
		int temp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = temp;

	}

}
