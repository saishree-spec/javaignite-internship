package day7assignments;

public class Order {
	    int orderId;
	    String customerName;
	    String productName;
	    int quantity;
	    private double pricePerItem;
	    Order(int orderId, String customerName, String productName,
	          int quantity, double pricePerItem) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.productName = productName;
	        this.quantity = quantity;
	        this.pricePerItem = pricePerItem;
	    }
	    double calculateTotal() {
	        return quantity * pricePerItem;
	    }
	    double applyDiscount() {
	        double total = calculateTotal();

	        if (total > 10000) {
	            total = total - (total * 0.20);
	        } else if (total > 5000) {
	            total = total - (total * 0.10);
	        }

	        return total;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Order o1 = new Order(101, "Shree", "Laptop", 2, 6000);

	        System.out.println("Total Amount = " + o1.calculateTotal());
	        System.out.println("Final Amount after Discount = " + o1.applyDiscount());
	    }
	
}

	