package com.ds;

public class StackedLinkedListImpl {

	public static void main(String[] args) {
		StackedLinkedList<String> sda = new StackedLinkedList<String>();
		sda.push("John");
		sda.push("Bob");
		System.out.println(sda.pop());
		System.out.println(sda.pop());
	}

}
