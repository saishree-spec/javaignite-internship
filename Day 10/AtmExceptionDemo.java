package day10_assisgnments;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative");
            }

            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }

            balance = balance - withdraw;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Withdrawal Amount");
        } catch (ArithmeticException e) {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}