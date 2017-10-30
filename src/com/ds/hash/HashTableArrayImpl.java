package com.ds.hash;

public class HashTableArrayImpl {

	public static void main(String[] args) {
		HashTableArray<String> hta = new HashTableArray<String>(5);
		hta.put(1, "Bob");
		hta.put(2, "John");
		hta.put(3, "Bill");
		hta.put(4, "Joe");
		hta.put(5, "Tom,");
		System.out.println(hta.Get(3));
	}

}
