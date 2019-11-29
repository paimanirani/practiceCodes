package org.examples.practice;

import java.util.ArrayList;
import java.util.List;

//Incorrect 
//use the "Visited this node" approach
public class blah3 {

	public static void main(String[] args) {
		List<List<Integer>> lot = new ArrayList<>();
		List<Integer> blah1 = new ArrayList<>();
		blah1.add(1);
		blah1.add(1);
		blah1.add(0);

		List<Integer> blah2 = new ArrayList<>();
		blah2.add(0);
		blah2.add(1);
		blah2.add(1);

		List<Integer> blah3 = new ArrayList<>();
		blah3.add(0);
		blah3.add(0);
		blah3.add(9);

		lot.add(blah1);
		lot.add(blah2);
		lot.add(blah3);

		System.out.println(removeObstacle(lot.size(), lot.get(0).size(), lot));
	}

	static int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot) {
		int count = 0;
		int currentRow = 0;
		int currentColumn = 0;
		int obstacle = 9;
		while (lot.get(currentRow).get(currentColumn) != obstacle) {
			count++;
			if (currentColumn != 0 && lot.get(currentRow).get(currentColumn - 1) != 0) { // left
				currentColumn--;
				continue;
			} else if (currentRow != numRows - 1 && lot.get(currentRow + 1).get(currentColumn) != 0) { // down
				currentRow++;
				continue;
			} else if (currentColumn != numColumns - 1 && lot.get(currentRow).get(currentColumn + 1) != 0) { // right
				currentColumn++;
				continue;
			} else if (currentRow != 0 && lot.get(currentRow - 1).get(currentColumn) != 0) { // up
				currentRow--;
				continue;
			}
		}
		return count;
	}

}
