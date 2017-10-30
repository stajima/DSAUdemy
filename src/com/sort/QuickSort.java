package com.sort;

public class QuickSort {

	static void sort(int[] arr, int lowIndex, int highIndex) {
		int midIndex = lowIndex + (highIndex - lowIndex) / 2;
		int pivotValue = arr[midIndex];
		int i = lowIndex;
		int j = highIndex;
		while (i <= j) {
			while (arr[i] < pivotValue) {
				i++;
			}
			while (arr[j] > pivotValue) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (lowIndex < j) {
			sort(arr, lowIndex, j);
		}
		if (highIndex > i) {
			sort(arr, i, highIndex);
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 6, 7, 2 };
		System.out.println("Before");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		sort(array, 0, array.length - 1);
		System.out.println("\nAfter");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

}
