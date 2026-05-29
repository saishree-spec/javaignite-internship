package day_3_assignments;
import java.util.Scanner;

public class Smart_login_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "Java@123";

        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter Username: ");
            String username = sc.next();

            System.out.print("Enter Password: ");
            String password = sc.next();

            if (username.equals(correctUser)) {

                if (password.equals(correctPass)) {

                    System.out.print("Enter OTP: ");
                    int otp = sc.nextInt();

                    if (otp >= 1000 && otp <= 9999) {
                        System.out.println("Login Successful");
                    } else {
                        System.out.println("Invalid OTP");
                    }
                    break;

                } else {
                    if (password.startsWith("Java") &&
                        password.endsWith("123")) {
                        System.out.println("Almost correct password");
                    } else {
                        System.out.println("Wrong Password");
                    }
                }

            } else {
                System.out.println("Invalid Username");
            }

            attempts++;
        }

        if (attempts == 3) {
            System.out.println("Account Blocked");
        }

        sc.close();

	}

}
