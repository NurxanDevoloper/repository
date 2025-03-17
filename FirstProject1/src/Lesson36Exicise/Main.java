package Lesson36Exicise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Lesson36.Student;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("Nurhan", "Haqverdiyev");
		Person person2 = new Person("Umud", "Iskenderov");
		List<Person> personsList = new ArrayList<>();
		
		personsList.add(person);
		personsList.add(person);
		personsList.add(person2);
		
		System.out.println(personsList);
		Set<Person> personsSet = new HashSet<>();
		personsSet.add(person);
		personsSet.add(person);
		personsSet.add(person2);
		
		System.out.println(personsSet);
	}

}
