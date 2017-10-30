package com.search;

public class InterpolationSearch {

	public static void main(String[] args) {
		DataSet ds = new DataSet(50);
		int highIndex = ds.getSize() - 1;
		int lowIndex = 0;
		int midPointIndex;
		int searchValue = 24;
		boolean isFound = false;
		
		while (!isFound) {
			if (lowIndex > highIndex) {
				System.out.println("Search value has not been found");
			}
			midPointIndex = ((highIndex - lowIndex) / (ds.dataSet[highIndex] - ds.dataSet[lowIndex])) * (searchValue - ds.dataSet[lowIndex]);
			ds.numberOfTries++;
			int midPointValue = ds.dataSet[midPointIndex];
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
