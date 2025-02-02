package Lesson24Homework;

public class Cat extends Animal {
    // Override - это аннотация в java, которая указывает, что метод переопределяет метод суперкласса. 
	@Override
	void makeSound() {
		System.out.println("Кошка мяукает.");
	}
}