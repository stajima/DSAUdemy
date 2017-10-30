package com.search;

public class DataSet {
	
	int numberOfTries;
	int size;
	int[] dataSet;

	public DataSet(int size) {
		dataSet = new int[size];
		for (int i = 0;i < dataSet.length; i++) {
			dataSet[i] = i;
		}
	}
	
	public int getSize() {
		return dataSet.length;
	}

}
