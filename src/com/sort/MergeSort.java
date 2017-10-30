package com.sort;

import java.util.Arrays;

public class MergeSort {

	void merge(int[] L, int[] R, int[] array) {
		int nL = L.length;
		int nR = R.length;
		int i, j, k;
		i = j = k = 0;
		while (i < nL && j < nR) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < nR) {
			array[k] = R[j];
			j++;
			k++;
		}
	}

	void mergeSort(int[] array) {
		int n = array.length;
		if (n < 2)
			return;
		int middle = n / 2;
		int[] L = new int[middle]; 
		int[] R = new int[n - middle];
		for (int i = 0; i < middle; i++) {
			L[i] = array[i];
		}
		for (int i = middle; i < n; i++) {
			R[i - middle] = array[i];
		}
		mergeSort(L);
		mergeSort(R);
		merge(L, R, array);
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 6, 2, 9 };
		MergeSort ob = new MergeSort();
		System.out.println(Arrays.toString(array));
		ob.mergeSort(array);
		System.out.println(Arrays.toString(array));
	}

}
