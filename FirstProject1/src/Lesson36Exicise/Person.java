package Lesson36Exicise;

import java.util.Objects;

public class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String latName) {
		this.firstName = firstName;
		this.lastName = latName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", latName=" + lastName + "]";
	}

}
