package day1assignments;
import java.util.Scanner;

public class Online_Shopping_bill_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer name:");
		String customername=sc.nextLine();
		System.out.println("enter product name:");
		String productname=sc.nextLine();
		System.out.println("enter product price:");
		double productprice = sc.nextDouble();
		System.out.println("enter quantity");
		int quantity = sc.nextInt();
		double totalbill = productprice * quantity;
		System.out.println("\nbill");
		System.out.println("customer name:"+ customername);
		System.out.println("product:"+ productname);
		System.out.println("price:"+ productprice);
		System.out.println("quantity:"+quantity);
		System.out.println("totalbill:"+ totalbill);
		 sc.close();
	}

}
