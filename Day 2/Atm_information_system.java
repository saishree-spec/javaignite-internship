package day1assignments;
import java.util.Scanner;
public class Atm_information_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = sc.nextDouble();
        boolean canWithdraw = balance > withdrawal;
        double remainingBalance = balance - withdrawal;
        System.out.println("\n----- ATM DETAILS -----");
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawal);
        System.out.println("Remaining Balance: " + remainingBalance);
        System.out.println("Balance > Withdrawal : " + canWithdraw);
        sc.close();
	}

}
