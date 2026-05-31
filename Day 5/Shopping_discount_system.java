package day5assignments;
import java.util.Scanner;
public class Shopping_discount_system {
public static double calculatefinalbill(double billAmount,double discountpercent) {
	double discount = (billAmount * discountpercent)/100;
	return billAmount-discount;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bill amount:");
		double billAmount = sc.nextDouble();
		System.out.println("enter discount percentage:");
		double discountpercent = sc.nextDouble();
		double finalbill = calculatefinalbill(billAmount,discountpercent);
		System.out.println("final bill:"+ finalbill);
		sc.close();
	}

}
