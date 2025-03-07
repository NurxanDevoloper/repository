package Lesson35;


public class Main {
	public static void main(String[] args) {
		Box box =new Box();
		box.setName();
		
		BoxGenerics<Integer> boxG= new BoxGenerics<Integer>();
		boxG.setItem(5);
		
		BoxGenerics<Long> boxG2= new BoxGenerics<Long>();
		boxG.setItem(5);
		
		BoxGenerics<Byte> boxG3= new BoxGenerics<Byte>();
		boxG.setItem(5);
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