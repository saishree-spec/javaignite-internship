package day1assignments;
import java.util.Scanner;
public class Travel_expense_estimator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter travel distance(km)");
		double distance = sc.nextDouble();
		System.out.println("enter the petrol price per litre");
		double petrolprice = sc.nextDouble();
		System.out.println("enter vehicle mileage(km/l");
		double mileage = sc.nextDouble();
		double petrolneeded = distance/mileage;
		double totalcost = petrolprice*petrolneeded;
		System.out.println("\n TRAVEL DETAILS");
        System.out.println("Petrol Needed: " + petrolneeded + " liters");
        System.out.println("Total Travel Cost: " + totalcost);

        sc.close();
	}

}
