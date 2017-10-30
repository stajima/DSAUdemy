package com.ds;

public class StackDArrayImpl {

	public static void main(String[] args) {
		StackDArray<String> sda = new StackDArray<String>(2);
		sda.push("John");
		sda.push("Bob");
		sda.push("Bill");
		System.out.println(sda.getSize());
		sda.push("Tom");
		sda.push("Joe");
		while (!sda.isEmpty()) {
			System.out.println(sda.pop());
		}
	}

}
