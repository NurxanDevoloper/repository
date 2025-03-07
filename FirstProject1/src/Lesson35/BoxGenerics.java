package Lesson35;

public class BoxGenerics<T, Y> {
	// 	// Для X
	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
	
	// Для Y..ф
	private T item2;

	public void setItem2(T item,Y item2) {
		this.item = item;
	}

	public T getItem2() {
		return item2;
	}
}
