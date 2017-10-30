package com.ds;

public class StackArray<T> {

	Object[] arrayStack;
	int top;
	int size;

	public StackArray(int size) {
		this.size = size;
		arrayStack = new Object[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == (size - 1);
	}

	public void push(Object newValue) {
		if (isFull()) {
			System.out.println("Stack is full!");
			return;
		}
		arrayStack[++top] = newValue;
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}
		return (T) arrayStack[top--];
	}

}
