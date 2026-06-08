package day10_assisgnments;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw > balance) {
                throw new Exception("Insufficient balance");
            }

            balance = balance - withdraw;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: " + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}