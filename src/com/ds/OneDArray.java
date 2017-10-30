package com.ds;

public class OneDArray {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 20;
		numbers[1] = 5;
		numbers[2] = 10;
		numbers[3] = 6;
		numbers[4] = 11;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Index " + i + " contains " + numbers[i]);
		}
		
		Student[] students = new Student[5];
		students[0] = new Student("John Doe", 25);
		students[1] = new Student("Jane Doe", 27);
		students[2] = new Student("Boe Dill", 30);
		students[3] = new Student("Tom Freeman", 84);
		students[4] = new Student("Jack Hill", 42);
		for (Student student: students) {
			System.out.println(student.name + " is " + student.age + " years old");
		}
	}

}
