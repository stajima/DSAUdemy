package com.ds;

public class DynamicArrayImpl {

	public static void main(String[] args) {
		DynamicArray<Integer> da = new DynamicArray<Integer>();
		
		da.put(1);
		System.out.println("Size: " + da.getSize());
		da.put(2);
		System.out.println("Size: " + da.getSize());
		da.put(3);
		System.out.println("Size: " + da.getSize());
		da.put(4);
		System.out.println("Size: " + da.getSize());
		da.put(5);
		System.out.println("Size: " + da.getSize());
		da.put(6);
		System.out.println("Size: " + da.getSize());
		da.put(7);
		System.out.println("Size: " + da.getSize());
		
		for (int i = 0; i < da.getSize(); i++) {
			System.out.println(da.get(i));
		}
		
	}

}
