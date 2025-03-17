package Lesson37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// сортировка по возростам
//		List<Student> students = new ArrayList<Student>();
//	    Student stu1 = new Student("Elvin", 13);
//	    Student stu2 = new Student("Aylin", 17);
//	    Student stu3 = new Student("Nurhan", 11);
//	    Student stu4 = new Student("Umud", 13);
	    
//	    students.add(stu1);
//	    students.add(stu2);
//	    students.add(stu3);
//	    students.add(stu4);
//	    System.out.println(students);
//	    Collections.sort(students);
//	    System.out.println(students);
	    
	    // сортировка по именам
	    List<Person> people = new ArrayList<Person>();
	    Person person1 = new Person("Elvin", 12);
	    Person person2 = new Person("Emil", 11);
	    Person person3 = new Person("Nara", 9);
	    Person person4 = new Person("Sabir", 15);
	    Person person5 = new Person("Meleyke", 16);
	    
	    people.add(person1);
	    people.add(person2);
	    people.add(person3);
	    people.add(person4);
	    people.add(person5);
	    
	    System.out.println(people);
	    people.sort(person1);
	    System.out.println(people);
	}

}
