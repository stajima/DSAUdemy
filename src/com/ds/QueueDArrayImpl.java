package com.ds;

public class QueueDArrayImpl {

	public static void main(String[] args) {
		QueueDArray<String> qda = new QueueDArray<String>(2);
		System.out.println(qda.getSize());
		qda.queue("John");
		qda.queue("Bob");
		qda.queue("Bill");
		System.out.println(qda.getSize());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
		System.out.println(qda.deQueue());
	}

}
