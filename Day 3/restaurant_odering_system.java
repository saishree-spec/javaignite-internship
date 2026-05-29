package day_3_assignments;
import java.util.Scanner;
public class restaurant_odering_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int price = 0;

	        System.out.println("1. Veg");
	        System.out.println("2. Non-Veg");
	        System.out.print("Select Category: ");
	        int category = sc.nextInt();

	        if (category == 1) {

	            System.out.println("1. Fried Rice - ₹150");
	            System.out.println("2. Noodles - ₹120");
	            System.out.print("Choose Item: ");
	            int item = sc.nextInt();

	            if (item == 1)
	                price = 150;
	            else if (item == 2)
	                price = 120;
	            else {
	                System.out.println("Invalid Selection");
	                return;
	            }

	        } else if (category == 2) {

	            System.out.println("1. Chicken Biryani - ₹250");
	            System.out.println("2. Grill Chicken - ₹300");
	            System.out.print("Choose Item: ");
	            int item = sc.nextInt();

	            if (item == 1)
	                price = 250;
	            else if (item == 2)
	                price = 300;
	            else {
	                System.out.println("Invalid Selection");
	                return;
	            }

	        } else {
	            System.out.println("Invalid Selection");
	            return;
	        }

	        System.out.print("Enter Quantity: ");
	        int qty = sc.nextInt();

	        double bill = price * qty;

	        System.out.print("Enter Member Status (Gold/Silver/Normal): ");
	        String member = sc.next();

	        if (member.equalsIgnoreCase("Gold")) {
	            bill = bill - (bill * 0.20);
	        } else if (member.equalsIgnoreCase("Silver")) {
	            bill = bill - (bill * 0.10);
	        }

	        System.out.println("Final Bill = ₹" + bill);

	        if (bill > 2000 && member.equalsIgnoreCase("Gold")) {
	            System.out.println("Congratulations! Free Dessert Included.");
	        }

	        sc.close();

	}

}
