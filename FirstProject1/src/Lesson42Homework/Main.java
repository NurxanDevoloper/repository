package Lesson42Homework;

public class Main {

	public static void main(String[] args) {

		Cleaning cleaning = new Cleaning();
		Eating eating = new Eating();
		Thread podcastThread = new Thread((new Thread()));

		cleaning.start();
		eating.start();
		podcastThread.start();
	}

}
