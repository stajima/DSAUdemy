package com.ds;

public class QueueLinkedList<T> {

	DoublyNode front;
	DoublyNode rear;

	public QueueLinkedList() {
		front = null;
		rear = null;
	}

	public void queue(Object value) {
		DoublyNode newNode = new DoublyNode(value, null, null);
		if (front == null || rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			newNode.previous = rear;
			rear.next = newNode;
			rear = newNode;
		}
	}

	public T deQueue() {
		if (front == null || rear == null) {
			System.out.println("Queue is empty!");
			return null;
		}
		@SuppressWarnings("unchecked")
		T value = (T) front.value;
		front = front.next;
		if (front != null) {
			front.previous = null;
		}
		return value;
	}

}
