package Lesson27Exicise;

abstract class Animal {
	void eat() {
		System.out.println("Собака кушает");
	}

	// Создаю абстрактный метод без реализации
	abstract void makeSound();
}
