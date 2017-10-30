package com.ds;

public class StackArrayImpl {

	public static void main(String[] args) {
		StackArray<String> sa = new StackArray<String>(5);
		sa.push("John");
		sa.push("Bob");
		sa.push("Bill");
		sa.push("Tom");
		sa.push("Joe");
		while (!sa.isEmpty()) {
			System.out.println(sa.pop());
		}
	}

}
