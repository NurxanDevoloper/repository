package Lesson36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// List - дубликаты допускаются , и сохраняется порядок
		List<Integer> numbers = new ArrayList<>();
//		numbers.add(5);
//		numbers.add(10);
//		numbers.add(10);
//		numbers.add(14);
//		numbers.remove(1);
//		numbers.set(3, 15);
//		System.out.println(numbers);

//		List<String> names = new ArrayList<String>();
//		names.add("Nara");
//		names.add("Meleyke");
//		names.add("Aylin");
//		for (String string : names) {
//			System.out.println(string);
//		}
//		System.out.println(names.size());
//		System.out.println(names);
//		names.clear();
//		System.out.println(names);
//		System.out.println(names.contains("Nara"));

		// Если порядок важен то использую лист, а если не важен то использую SET, если
		// нужна уникальность то лист, если нет то SET
		
		Set<String> names2 = new HashSet<String>();
		names2.add("Aylin");
		names2.add("Nara");
		names2.add("Umud");
		names2.add("Emil");
		
		names2.remove("Meleyke");
		names2.contains("Umud");
		System.out.println(names2);
		

		Student student = new Student("Emil", 15);
		Student student2 = new Student("Umud", 13);
		List<Student> studentsList = new ArrayList<>();
		
		studentsList.add(student);
		studentsList.add(student);
		studentsList.add(student2);
		
		System.out.println(studentsList);
		Set<Student> studentsSet = new HashSet<>();
		studentsSet.add(student);
		studentsSet.add(student);
		studentsSet.add(student2);
		
		System.out.println(studentsSet);
	}

}
