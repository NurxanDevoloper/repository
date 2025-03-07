package Lesson35;

public class Main {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setName("Emil");
//		int a = 10;
//		Integer b = 10;
//		b = b.MAX_VALUE;

		BoxGenerics<Boolean, String> boxG = new BoxGenerics<>(true, "Smh");
		System.out.println("Item 1: " + boxG.getItem());
		System.out.println("Item 2: " + boxG.getItem2());

		boxG.setItem(false);
		boxG.setItem2("Updated String");
		System.out.println("Updated Item 1: " + boxG.getItem());
		System.out.println("Updated Item 2: " + boxG.getItem2());

		BoxGenerics<Long, Integer> boxG2 = new BoxGenerics<>(100L, 200);
		System.out.println("BoxG2 Item 1: " + boxG2.getItem());
		System.out.println("BoxG2 Item 2: " + boxG2.getItem2());

		BoxGenerics<Byte, Double> boxG3 = new BoxGenerics<>((byte) 5, 5.5);
		System.out.println("BoxG3 Item 1: " + boxG3.getItem());
		System.out.println("BoxG3 Item 2: " + boxG3.getItem2());
	}
}
//byte
// int
// double
// long
//boolean
//float
//char

//String