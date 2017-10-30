package com.ds;

public class DoublyLinkedList<T> {

	DoublyNode head;

	public DoublyLinkedList() {
		head = null;
	}

	public void add(Object value) {
		DoublyNode newNode = new DoublyNode(value, null, null);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}

	public void delete() {
		head = head.next;
		head.previous = null;
	}

	@SuppressWarnings("unchecked")
	public void display() {
		DoublyNode n = head;
		while (n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}


}
