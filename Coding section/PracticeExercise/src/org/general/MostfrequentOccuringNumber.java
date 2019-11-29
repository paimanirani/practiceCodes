/*
 * 
 * Find the mode or most occuring element in a list, also find the max
 * 
 */

package org.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MostfrequentOccuringNumber {

	public static void findMax(List<Integer> inputList) {
		int max = Collections.max(inputList);
		System.out.println("Max number in list: " + max);
	}

	public static void findMode(List<Integer> list) {

		int tempCount, maxCount = 0, tempCountNum = 0, maxCountNum = 0;
		Set<Integer> ignore = new TreeSet<>();

		System.out.println("\nMode finding begins..");

		for (int i = 0; i < list.size() - 1; i++) {
			tempCount = 1;
			for (int j = i + 1; j < list.size(); j++) {
				tempCountNum = list.get(i);
				if (!ignore.contains(i) && list.get(i) == list.get(j)) {
					ignore.add(j);
					tempCount++;

				}
			}
			if (tempCount > maxCount) {
				maxCountNum = tempCountNum;
				maxCount = tempCount;
			}

		}
		// for (int value : ignore) {
		// System.out.println(value);
		// }

		if (maxCount == 1) {
			System.out.println("Max freq for all number is 1");
		} else {
			System.out.println("Number is " + maxCountNum + " Freq :" + maxCount);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(333);
		list.add(9);
		list.add(1);
		list.add(12);
		list.add(1);
		list.add(8);
		list.add(1);
		list.add(47);
		list.add(59);
		list.add(91);
		list.add(32);
		list.add(1);
		list.add(1);
		list.add(1);

		findMax(list);
		findMode(list);
	}
}
