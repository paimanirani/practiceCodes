package org.general;

public class BruteForceToGetResult42 {
	private static int result = 42;

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 5 };
		String[] operators = { "+", "-", "*", "/" };
		calculate(values, operators);

	}

	private static void calculate(int[] values, String[] operators) {
		int results = 0;
		String output = "";
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				for (int u = 0; u < operators.length; u++) {
					int tempResult1 = 0;
					String tempOutput1 = "";
					int a = values[i];
					int b = values[j];
					String operator = operators[u];
					tempOutput1 = "" + a + "" + operator + "" + b;
					tempResult1 = arithmatic(a, b, operator);
					results = tempResult1;
					output = tempOutput1;
					if (results == result) {
						System.out.println(output + "=" + results + "\n");
					}

					for (int k = 0; k < values.length; k++) {
						if (k != i && k != j) {
							int tempResult2 = 0;
							String tempOutput2 = "";
							for (int v = 0; v < operators.length; v++) {
								operator = operators[v];
								int c = values[k];
								tempOutput2 = "" + operator + "" + c;
								tempResult2 = arithmatic(tempResult1, c, operator);
								results = tempResult2;
								output = tempOutput1 + tempOutput2;
								if (results == result) {
									System.out.println(output + "=" + results + "\n");
								}

								for (int l = 0; l < values.length; l++) {
									if (l != i && l != j && l != k) {
										int tempResult3 = 0;
										String tempOutput3 = "";
										for (int w = 0; w < operators.length; w++) {
											operator = operators[w];
											int d = values[l];
											tempOutput3 = "" + operator + "" + d;
											tempResult3 = arithmatic(tempResult2, d, operator);
											results = tempResult3;
											output = tempOutput1 + tempOutput2 + tempOutput3;
											if (results == result) {
												System.out.println(output + "=" + results + "\n");
											}

											for (int m = 0; m < values.length; m++) {
												if (m != i && m != j && m != k && m != l) {
													int tempResult4 = 0;
													String tempOutput4 = "";
													for (int x = 0; x < operators.length; x++) {
														operator = operators[x];
														int e = values[m];
														tempOutput4 = "" + operator + "" + e;
														tempResult4 = arithmatic(tempResult3, e, operator);
														results = tempResult4;
														output = tempOutput1 + tempOutput2 + tempOutput3 + tempOutput4;
														if (results == result) {
															System.out.println(output + "=" + results + "\n");
														}
													}

												}
											}
										}

									}
								}

							}
						}
					}

				}
			}
		}
	}

	public static int arithmatic(int a, int b, String operator) {
		int result = 0;
		switch (operator) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		}
		return result;
	}

}