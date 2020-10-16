package com.tarun;

/**
 *  Worst complexity: n^2
	Average complexity: n^2
	Best complexity: n^2
	Space complexity: 1
 * @author tarun.murala
 *
 */

public class SelectionSort {
	
	public SelectionSort() {
		super();
	}

	public int[] sort(int[] array) {
		if(null != array && array.length > 1) {
			for (int i = 0; i < array.length-1; i++) {
				for (int j = i+1; j < array.length; j++) {
					if(array[j] < array[i]) {
						// swap the numbers
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		return array;
	}

}
