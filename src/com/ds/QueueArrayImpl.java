package com.ds;

public class QueueArrayImpl {

	public static void main(String[] args) {
		QueueArray<String> qa = new QueueArray<String>(3);
		qa.queue("John");
		qa.queue("Bob");
		qa.queue("Bill");
		qa.queue("Tom"); // Will say full!
		while (!qa.isEmpty()) {
			System.out.println(qa.deQueue());
		}
	}

}
