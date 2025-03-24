package Lesson34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee("Elvin", 12);
		Employee emp2 = new Employee("Aylin", 14);
		Employee emp3 = new Employee("Umud", 15);
		Employee emp4 = new Employee("Nurhan", 13);
		Employee emp5 = new Employee("Meleyke", 9);

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		Collections.sort(employees);
		System.out.println(employees);
	}

}
