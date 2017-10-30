package com.search;

public class LinearSearch {

	public static void main(String[] args) {
		int search = 5;
		Boolean wasFound = false;
		DataSet ds = new DataSet(10);
		for (int i = 0; i < ds.getSize(); i++) {
			ds.numberOfTries++;
			if (ds.dataSet[i] == search) {
				System.out.println("Number was found after " + ds.numberOfTries + " tries");
				wasFound = true;
				return;
			}
		}
		if (!wasFound) {
			System.out.println("Number was not found");
		}
	}

}
