package Lesson37Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Сортировка сотрудников по возрасту
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee("Elvin", 13);
		Employee emp2 = new Employee("Aylin", 14);
		Employee emp3 = new Employee("Nurhan", 11);
		Employee emp4 = new Employee("Umud", 13);

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		System.out.println(employees);
		Collections.sort(employees);
		System.out.println(employees);

		List<Worker> workers = new ArrayList<Worker>();
		Worker worker1 = new Worker("Elvin", 12);
		Worker worker2 = new Worker("Emil", 11);
		Worker worker3 = new Worker("Nara", 9);
		Worker worker4 = new Worker("Sabir", 15);
		Worker worker5 = new Worker("Meleyke", 16);

		workers.add(worker1);
		workers.add(worker2);
		workers.add(worker3);
		workers.add(worker4);
		workers.add(worker5);

		System.out.println(workers);
		workers.sort(worker1);
		System.out.println(workers);

	}
}
