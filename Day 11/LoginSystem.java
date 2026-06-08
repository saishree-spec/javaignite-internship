package day11assignment;
import java.util.Scanner;

//Custom Exception for Invalid Username
class InvalidUsernameException extends Exception {
 public InvalidUsernameException(String message) {
     super(message);
 }
}

//Custom Exception for Weak Password
class WeakPasswordException extends Exception {
 public WeakPasswordException(String message) {
     super(message);
 }
}

public class LoginSystem {

 public static void validateLogin(String username, String password)
         throws InvalidUsernameException, WeakPasswordException {

     if (username.trim().isEmpty()) {
         throw new InvalidUsernameException("Username cannot be empty");
     }

     if (password.length() < 6) {
         throw new WeakPasswordException(
                 "Password must be at least 6 characters");
     }

     System.out.println("Login Successful");
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Username: ");
         String username = sc.nextLine();

         System.out.print("Enter Password: ");
         String password = sc.nextLine();

         validateLogin(username, password);

     } catch (InvalidUsernameException e) {
         System.out.println(e.getMessage());
     } catch (WeakPasswordException e) {
         System.out.println(e.getMessage());
     } finally {
         sc.close();
     }
 }
}