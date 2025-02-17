package Lesson26Homework_2;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	private String city;

	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, city, name);
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
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}
}