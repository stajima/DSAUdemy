package com.sort;

public class BubbleSort {

	static void sort(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			boolean neverSorted = true;
			for (int j = 0; j < n - i - 1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					neverSorted = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (neverSorted) {
				break;
			}
		}
		System.out.println("\nCount " + count);
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 6, 7, 2 };
		System.out.println("Before");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		sort(array);
		System.out.println("After");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

}
