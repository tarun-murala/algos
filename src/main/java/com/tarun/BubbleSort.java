package com.tarun;

/**
 *  Worst complexity: n^2
	Average complexity: n^2
	Best complexity: n
	Space complexity: 1
 * @author tarun.murala
 */

public class BubbleSort {

	public BubbleSort() {
		super();
	}
	
	public int[] sort(int[] array) {
		if(null != array && array.length > 1) {
			for (int i = 0; i < array.length-1; i++) {
				boolean isSorted = true;
				for (int j = 0; j < array.length-i-1; j++) {
					if(array[j] > array[j+1]) {
						// swap the numbers
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						isSorted = false;
					}
				}
				if(isSorted)
					break;
				isSorted = true;
			}
		}
		return array;
	}

}
