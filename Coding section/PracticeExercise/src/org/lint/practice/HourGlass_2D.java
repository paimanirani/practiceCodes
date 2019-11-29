package org.lint.practice;

public class HourGlass_2D {

	/**
	 * find maximum sum of 2D hour glass 
	 * 
	 *a b c
	 *  d 
	 *e f g
	 */
	public static void main(String[] args) {

		// int[][] input = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0,
		// 0, 0 }, { 0, 0, 2, 4, 4, 0 },
		// { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int[][] input = { { -9, -9, -9, 1, 1, 1 }, { 0, -9, 0, 4, 3, 2 }, { -9, -9, -9, 1, 2, 3 }, { 0, 0, 8, 6, 6, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		System.out.println(findMax(input));
	}

	private static int findMax(int[][] arr) {
		int max = Integer.MIN_VALUE;
		int total = 0;
		if (arr.length >= 2 && arr[0].length >= 2) {
			for (int i = 0; i < arr.length - 2; i++) {
				for (int j = 1; j < arr[i].length - 1; j++) {
					total = arr[i][j - 1] + arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 2][j - 1]
							+ arr[i + 2][j] + arr[i + 2][j + 1];
					if (total > max) {
						max = total;
					}
				}
			}
			return max;
		} else {
			return 0;
		}

	}
}