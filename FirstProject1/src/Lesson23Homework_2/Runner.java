package Lesson23Homework_2;

public class Runner extends Athlete {
	// Присваиваю поле distance
	private double distance;

	// Создаю метод для установки расстояния
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void run() {
    	// Проверяю задано ли имя для объекта
        if (getName() != null) {
            System.out.println("Бегун " + getName() + " пробежал " + distance + " километров.");
        } else {
            System.out.println("Бегун пробежал " + distance + " километров, но имя не указано.");
        }
    }
}
