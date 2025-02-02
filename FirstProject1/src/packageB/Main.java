package packageB;

import packageA.Person;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.id);
		person.getDetails();
	}
}
