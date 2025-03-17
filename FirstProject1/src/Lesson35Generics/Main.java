package Lesson35Generics;

public class Main {
	public static void main(String[] args) {
        Triple<Integer, String, Double> triple = new Triple<>(20, "Hello smb", 3.1415698945984);
        
        triple.getFirst();
        triple.getSecond();
        triple.getThird();
        
        triple.setFirst(10);
        triple.setSecond("Bye");
        triple.setThird(2.5);
        
        triple.printTriple();
	}
}