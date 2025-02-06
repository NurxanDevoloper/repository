package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать его.");

        while (!win) {
            System.out.print("Введите ваше предположение: ");
            guess = scanner.nextInt();
            numberOfTries++;

            // Даю условие  
            if (guess < 1 || guess > 100) {
                System.out.println("Пожалуйста, введите число от 1 до 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Загаданное число больше.");
            } else if (guess > numberToGuess) {
                System.out.println("Загаданное число меньше.");
            } else {
                win = true;
                System.out.println("Поздравляем! Вы угадали число " + numberToGuess + " за " + numberOfTries + " попыток.");
            }
        }

        scanner.close();
    }
}