package com.tarun;

import junit.framework.TestCase;

public class BubbleSortTest extends TestCase {

	public void testSort() {
		BubbleSort sort = new BubbleSort();
		int[] sortedArray = sort.sort(new int[] {4,3,5,2,1});
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ,");
		}
	}

}
