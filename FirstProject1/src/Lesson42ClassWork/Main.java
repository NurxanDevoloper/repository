package Lesson42ClassWork;

import Lesson42.Cooking;
import Lesson42.Music;
import Lesson42.MyRunnable;

public class Main {

	public static void main(String[] args) {

		WatchingYoutube watching = new WatchingYoutube();
		watching.start();
		
		Thread listening = new Thread(new Thread());
		listening.start();
	}

}
