package Lesson36Homework;

import java.util.Objects;

public class Item {
	private String name;

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}

}