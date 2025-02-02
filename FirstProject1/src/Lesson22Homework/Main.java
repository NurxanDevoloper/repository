package Lesson22Homework;

import Lesson22.main3;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Nurhan", 13, 2.5);
		
		System.out.println("Name: " + student.getName());
		System.out.println("Age " + student.getAge());
		System.out.println("Gpa " + student.getGpa());
		
		// Change settings:
		student.setName("Sultan");
		student.setAge(23);
		
		// Data Update
		System.out.println("Updating");
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		
		// Data Update Gpa
		student.UpdateGpa(2.4);
		student.UpdateGpa(3.7);
	}
}
