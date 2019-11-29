package org.general;

import java.util.Arrays;

public class IntegerLists {

	public static void main(String[] args) {
		String input = "1,2,3,4;5,6,7";
		String output = "";
		String[] s_lists = input.split(";");
		String s_list1 = s_lists[0];
		String s_list2 = s_lists[1];
		if (s_list1.equals(s_list2)) {
			System.out.println(s_list1);
		} else {
			String[] i_lists1 = s_list1.split(",");
			int[] i_list1 = new int[i_lists1.length];
			for (int i = 0; i < i_list1.length; i++) {
				i_list1[i] = Integer.parseInt(i_lists1[i]);
			}
			String[] i_lists2 = s_list2.split(",");
			int[] i_list2 = new int[i_lists2.length];
			for (int i = 0; i < i_list2.length; i++) {
				i_list2[i] = Integer.parseInt(i_lists2[i]);
			}
			int[] values = new int[2];
			values[0] = i_list1[i_list1.length - 1];
			values[1] = i_list2[i_list2.length - 1];
			Arrays.sort(values);
			output = "" + values[0] + ", " + values[1];
			System.out.println(output);
		}
	}

}
