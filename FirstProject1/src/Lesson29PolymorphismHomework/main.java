package Lesson29PolymorphismHomework;

import Lesson25Homework_2.Car;

public class main {

	public static void main(String[] args) {
		Guitar guitar = new Guitar();
		guitar.playSound();

		Piano piano = new Piano();
		piano.playSound();

		Instrument[] instruments = {guitar, piano};

		for (Instrument instrument : instruments) {
			instrument.playSound();
		}

	}

}
