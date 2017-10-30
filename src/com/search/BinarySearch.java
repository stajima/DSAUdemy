package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		DataSet ds = new DataSet(50);
		int highIndex = ds.getSize() - 1;
		int lowIndex = 0;
		int midPointIndex;
		int searchValue = 0;
		boolean isFound = false;
		
		while (!isFound) {
			if (lowIndex > highIndex) {
				System.out.println("Search value has not been found");
			}
			midPointIndex = lowIndex + ((highIndex - lowIndex) / 2);
			int midPointValue = ds.dataSet[midPointIndex];
			ds.numberOfTries++;
			if (midPointValue == searchValue) {
				System.out.println("Search value has been found at index " + midPointIndex + " after " + ds.numberOfTries + " tries");
				isFound = true;
				break;
			}
		
			if (midPointValue < searchValue) {
				lowIndex = midPointIndex + 1;
			}
			
			if (midPointValue > searchValue) {
				highIndex = midPointIndex - 1;
			} 
		}
	}

}
