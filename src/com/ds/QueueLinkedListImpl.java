package com.ds;

public class QueueLinkedListImpl {

	public static void main(String[] args) {
		QueueLinkedList<String> qda = new QueueLinkedList<String>();
		qda.queue("John");
		qda.queue("Bob");
		qda.queue("Bill");
		qda.queue("Tom");
		qda.queue("Hobs");
		qda.queue("Dill");
		qda.queue("Jill");
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
	}
}
