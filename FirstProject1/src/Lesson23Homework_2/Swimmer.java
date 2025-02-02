package Lesson23Homework_2;

import java.time.chrono.ThaiBuddhistChronology;

public class Swimmer extends Athlete {
	private double swimTime;

	 public void setSwimTime(double swimTime) {
         this.swimTime = swimTime;
     }

	 public void swim() {
         if (getName() != null) {
             System.out.println("Пловец " + getName() + " проплыл за " + swimTime + " минут.");
         } else {
             System.out.println("Пловец проплыл за " + swimTime + " минут, но имя не указано.");
         }
     }
}
