package com.ds;

import java.util.Arrays;

public class QueueDArray<T> {

	Object[] queueDArray;
	int front;
	int rear;
	int size;

	public QueueDArray(int size) {
		queueDArray = new Object[size];
		this.size = size;
		front = -1;
		rear = -1;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			queueDArray = Arrays.copyOf(queueDArray, newCapacity);
		}
	}
	
	public int getSize() {
		return queueDArray.length;
	}

	public boolean isEmpty() {
		return (front == -1) || (front > rear);
	}

	public void queue(Object newValue) {
		ensureCapacity(rear + 2);
		queueDArray[++rear] = newValue;
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
		return (T) queueDArray[front++];
	}

}
