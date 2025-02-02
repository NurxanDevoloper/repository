package Lesson13;

public class GenderObj {

	public static void main(String[] args) {

		Person person = new Person();
		System.out.println("person1");
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.gender);
		
		
		Person person2=new Person("Umud", 15, "Men");
		System.out.println("person2");
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.gender);
		
		
	}

}
