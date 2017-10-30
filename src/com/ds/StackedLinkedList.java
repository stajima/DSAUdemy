package com.ds;

public class StackedLinkedList<T> {

	Node top;

	public StackedLinkedList() {
		top = null;
	}

	public void push(Object value) {
		Node newNode = new Node(value, null);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public T pop() {
		if (top == null) {
			System.out.println("Stack is empty!");
			return null;
		}
		@SuppressWarnings("unchecked")
		T node = (T) top.value;
		top = top.next;
		return node;
	}

	@SuppressWarnings("unchecked")
	public void display() {
		Node n = top;
		while (n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}

}
