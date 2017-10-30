package com.sort;

public class SelectionSort {

	static void sort(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			int index = i;
			for (int j = i + 1; j < n; j++) {
				count++;
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
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
