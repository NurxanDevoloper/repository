package Lesson27AbstractHomework;

abstract class Device {
	// Абстракция – это принцип объектно-ориентированного программирования (ООП),
	// который позволяет скрыть детали реализации и показывать только основные
	// характеристики объекта. В Java это достигается с помощью абстрактных классов
	// и интерфейсов.

	// Абстрактный класс – это класс, который нельзя создать как объект. Он
	// предназначен для того, чтобы другие классы от него наследовались и
	// реализовывали его абстрактные методы.

	// Абстрактный метод – это метод, который не имеет тела (реализации). Он
	// объявляется в абстрактном классе и должен быть переопределён в наследниках.
	
	abstract void turnOn();
      void turnOff() {
    	  //
      };
	
	
}