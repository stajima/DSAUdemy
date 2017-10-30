package com.sort;

import java.util.Arrays;

public class HeapSort {

    static int total;

    static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void heapify(Comparable[] arr, int i) {
        int leftNodeIndex = 2 * i; 
        int rightNodeIndex = (2 * i) + 1;
        int greaterNodeIndex = i;
        if (leftNodeIndex <= total && arr[leftNodeIndex].compareTo(arr[greaterNodeIndex]) >= 0) {
            greaterNodeIndex = leftNodeIndex;
        }		
        if (rightNodeIndex <= total && arr[rightNodeIndex].compareTo(arr[greaterNodeIndex]) >= 0) {
            greaterNodeIndex = rightNodeIndex;
        }
        if (greaterNodeIndex != i) {
            swap(arr, i, greaterNodeIndex);
            heapify(arr, greaterNodeIndex);
        }
    }

    static void sort(Comparable[] arr) {
        total = arr.length - 1; 
        for (int i = total / 2; i >= 0; i--) {
            heapify(arr, i);
        }
        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
    }

    public static void main(String[] args) {
        Integer[] array = { 1, 5, 3, 6, 2 };
        System.out.println("Before");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("After");
        System.out.println(Arrays.toString(array));
    }
}