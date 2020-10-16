package com.tarun;

import junit.framework.TestCase;

public class SelectionSortTest extends TestCase {

	public void testSort() {
		SelectionSort sort = new SelectionSort();
		int[] sortedArray = sort.sort(new int[] {4,3,5,2,1});
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ,");
		}
	}

}
