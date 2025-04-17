package Lesson43Homework;

import Lesson42.MyThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// метод join - позволяет одному потоку ждать завершения другого потока
		
		 Thread buyTicket = new Thread(() -> {
	            System.out.println("Покупаю билет...");
	            try { Thread.sleep(1000); } 
	            catch (InterruptedException e) {
	            	//
	            }
	            System.out.println("Билет куплен");
	        });

	        Thread buyPopcorn = new Thread(() -> {
	            System.out.println("Покупаю попкорн...");
	            try { Thread.sleep(1500); } 
	            catch (InterruptedException e) {
	            	//
	            }
	            System.out.println("Попкорн куплен");
	        });

	        Thread watchMovie = new Thread(() -> {
	        	
		        try {
					buyTicket.join();
			        buyPopcorn.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	            System.out.println("Смотрю кино");
	        });

	        buyTicket.start();
	        buyPopcorn.start();


	        watchMovie.start();

	        Alarm alarm = new Alarm();
	        alarm.start();
	        alarm.interrupt();
	}

}
