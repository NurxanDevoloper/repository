package Lesson36Homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1.2 
        System.out.println("Введите слово для поиска в списке:");
        String searchWord = scanner.nextLine();
		List<String> names = new ArrayList<String>();
        
        if (names.contains(searchWord)) {
            System.out.println("Слово найдено в списке!");
        } else {
            System.out.println("Слово отсутствует в списке.");
        }

     
	}

}
