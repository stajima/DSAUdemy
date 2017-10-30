package com.ds;

import java.util.Arrays;

public class StackDArray<T> {

	Object[] arrayStack;
	int top;
	int size;

	public StackDArray(int size) {
		this.size = size;
		arrayStack = new Object[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
	
	public int getSize() {
		return arrayStack.length;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = arrayStack.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			arrayStack = Arrays.copyOf(arrayStack, newCapacity);
		}
	}

	public void push(Object newValue) {
		ensureCapacity(top + 2);
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
