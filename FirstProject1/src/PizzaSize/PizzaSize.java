package PizzaSize;

public enum PizzaSize {
	Large(8), Medium(12), small(16);
	int price;
	
	PizzaSize(int price){
		this.price = price;
	}
	
	
	public int GetPrice() {
		return price;
	}
}

//enum - для перечисления значений.
