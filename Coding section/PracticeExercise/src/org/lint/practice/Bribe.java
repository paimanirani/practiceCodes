package org.lint.practice;

/**
 * It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! 
 * There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. 
 * Initial positions increment by 1 from 1 at the front of the line to n at the back.
 * Any person in the queue can bribe the person directly in front of them to swap positions. 
 * If two people swap positions, they still wear the same sticker denoting their original places in line. 
 * One person can bribe at most two others. For example, if n=8 and PERSON-5 bribes PERSON-5, the queue will look like this:
 * 1,2,3,5,4,6,7,8.

Output Format

Print an integer denoting the minimum number of bribes needed to get the queue into its final state. 
Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than 2 people.
 * @author paima
 *
 */
public class Bribe {

	public static void main(String[] args) {
		// int[] input = { 2, 5, 1, 3, 4 }; // 1,2,3,4,5
		int[] input = { 1, 2, 5, 3, 7, 8, 6, 4 }; // 1,2,3,4,5,6,7,8
		rotLeft(input);
	}

	static void rotLeft(int[] q) {
		boolean chaotic = false;
		int expectedNumber1 = 1;
		int expectedNumber2 = 2;
		int expectedNumber3 = 3;
		int count = 0;

		for (int j = 0; j < q.length; j++) {
			if (q[j] == expectedNumber1) {
				expectedNumber1 = expectedNumber2;
				expectedNumber2 = expectedNumber3;
				expectedNumber3++;
			} else if (q[j] == expectedNumber2) {
				expectedNumber2 = expectedNumber3;
				expectedNumber3++;
				count += 1;
			} else if (q[j] == expectedNumber3) {
				expectedNumber3++;
				count += 2;
			} else {
				chaotic = true;
				break;
			}
		}
		if (chaotic) {
			System.out.println("Too chaotic");
		} else {
			System.out.println(count);
		}
	}

	// static void rotLeft(int[] q) {
	// int count = 0;
	// int change = -1;
	// boolean chaotic = false;
	// Integer[] number = new Integer[q.length];
	// for (int i = 0; i < q.length; i++) {
	// number[i] = q[i];
	// }
	// List<Integer> temp = new LinkedList<>(Arrays.asList(number));
	// Collections.sort(temp);
	//
	// for (int j = 0; j < q.length; j++) {
	// if (!temp.get(j).equals(q[j])) {
	// change = q[j];
	// if (j + 1 < q.length && temp.get(j + 1).equals(change)) {
	// temp.remove(j + 1);
	// temp.add(j, change);
	// count += 1;
	// } else if (j + 2 < q.length && temp.get(j + 2).equals(change)) {
	// temp.remove(j + 2);
	// temp.add(j, change);
	// count += 2;
	// } else {
	// chaotic = true;
	// }
	//
	// }
	// }
	// if (chaotic) {
	// System.out.println("Too chaotic");
	// } else {
	// System.out.println(count);
	// }
	// }

}