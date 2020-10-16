package com.tarun;

/**
 *  Worst complexity: n^2
	Average complexity: n*log(n)
	Best complexity: n*log(n)
 * @author tarun.murala
 *
 */

public class QuickSort {
	
	public QuickSort() {
		super();
	}

	public int[] sort(int[] array) {
		if(null != array && array.length > 1) {
			int partitionIndex = this.partition(array, 0, array.length);
		}
		return array;
	}

	private int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int smallerElementIndex = low - 1;
		for (int j = smallerElementIndex; j < high; j++) {
			// one iteration of selection sort
			if(array[j] < pivot) {
				smallerElementIndex++;
				int temp = array[smallerElementIndex];
				array[smallerElementIndex] = array[j];
				array[j] = temp;
			}
		}
		
		return 0;
	}

}
