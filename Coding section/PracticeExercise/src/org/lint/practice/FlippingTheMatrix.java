package org.lint.practice;

//https://www.hackerrank.com/challenges/flipping-the-matrix/problem

public class FlippingTheMatrix {
	public static void main(String[] args) {
		// int[][] states = { { 112, 42, 83, 119 }, { 56, 125, 56, 49 }, { 15, 78, 101,
		// 43 }, { 62, 98, 114, 108 } };
		int[][] states = { { 107, 54, 128, 15 }, { 12, 75, 110, 138 }, { 100, 96, 34, 85 }, { 75, 15, 28, 112 } };

		// Solution solution = new Solution();
		System.out.println(flippingMatrix(states));
	}

	// Complete the flippingMatrix function below.
	static int flippingMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = m / 2;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum += Math.max(matrix[i][j],
						Math.max(matrix[i][m - 1 - j], Math.max(matrix[m - 1 - i][j], matrix[m - 1 - i][m - 1 - j])));
			}
		}

		return sum;

	}

}
