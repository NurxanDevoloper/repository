package Lesson35;

public class BoxGenerics<T, Y> {
	 private T item;
	    private Y item2;

	    public BoxGenerics(T item, Y item2) {
	        this.item = item;
	        this.item2 = item2;
	    }

	    public void setItem(T item) {
	        this.item = item;
	    }

	    public T getItem() {
	        return item;
	    }

	    public void setItem2(Y item2) {
	        this.item2 = item2;
	    }

	    public Y getItem2() {
	        return item2;
	    }
}
