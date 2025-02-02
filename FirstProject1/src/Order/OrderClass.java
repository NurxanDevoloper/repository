package Order;

public class OrderClass {
	private int orderId;
	private String dishName;
	private boolean isComleted;
	
	// Constructor
    public OrderClass(int orderId, String dishName, boolean isComleted) {
        this.orderId = orderId;
        this.dishName = dishName;
        this.isComleted = false;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public String getDishName() {
        return dishName;
    }
    
    public void completeOrder() {
    	isComleted = true;
    }
    
    public void getOrderStatus() {
    	if (isComleted) {
    		System.out.println("Выполнено");
			return;
		} else {
			System.out.println("Не выполнено");
			return;
		}
    }
}
