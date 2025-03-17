package Lesson35Generics;

public class Triple<T, U, V> {
	// Generics в Java — это механизм, который позволяет параметризовать типы данных
	// в классах, интерфейсах и методах. Это делает код более гибким, безопасным и
	// удобочитаемым, поскольку позволяет работать с разными типами данных без
	// потери безопасности типов.

	public T first;
	public U second;
	public V third;

	public Triple(T first, U second, V third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}

	public V getThird() {
		return third;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(U second) {
		this.second = second;
	}

	public void setThird(V third) {
		this.third = third;
	}

	public void printTriple() {
		System.out.println("first: " + first + ", second: " + second + ", third: " + third);
	}

}
