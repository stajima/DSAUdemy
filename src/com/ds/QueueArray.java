package com.ds;

public class QueueArray<T> {

	Object[] queueArray;
	int front;
	int rear;
	int size;

	public QueueArray(int size) {
		queueArray = new Object[size];
		this.size = size;
		front = -1;
		rear = -1;
	}

	public boolean isFull() {	
		return rear == (size - 1);
	}

	public boolean isEmpty() {
		return (front == -1) || (front > rear);
	}

	public void queue(Object newValue) {
		if (isFull()) {
			System.out.println("Queue is full!");
			return;
		}
		queueArray[++rear] = newValue;
		if (front == -1) {
			front = 0;
		}
	}

	@SuppressWarnings("unchecked")
	public T deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		}
		return (T) queueArray[front++];
	}
}
