
public class Mobile {
	    String brand;
	    private double price;
	    int storage;
	    Mobile(String brand, double price, int storage) {
	        this.brand = brand;
	        this.price = price;
	        this.storage = storage;
	    }
	    void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Storage: " + storage + " GB");
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {

	        Mobile m1 = new Mobile("Samsung", 25000, 128);
	        Mobile m2 = new Mobile("OnePlus", 32000, 256);

	        m1.displayDetails();
	        m2.displayDetails();
	    }
	}
	
}

	