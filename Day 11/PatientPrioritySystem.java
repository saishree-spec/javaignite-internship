package day11assignment;
import java.util.Scanner;
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
class InvalidPriorityException extends Exception {
 public InvalidPriorityException(String message) {
     super(message);
 }
}

public class PatientPrioritySystem {

 public static void assignPriority(String name, int age, int level)
         throws InvalidAgeException, InvalidPriorityException {

     if (age < 0 || age > 120) {
         throw new InvalidAgeException("Invalid Age");
     }

     if (level < 1 || level > 5) {
         throw new InvalidPriorityException("Invalid Priority Level");
     }

     System.out.println("Patient Name: " + name);
     System.out.println("Priority Level Assigned: " + level);
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Patient Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Age: ");
         int age = sc.nextInt();

         System.out.print("Enter Emergency Level (1-5): ");
         int level = sc.nextInt();

         assignPriority(name, age, level);

     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     } catch (InvalidPriorityException e) {
         System.out.println(e.getMessage());
     } catch (Exception e) {
         System.out.println("Invalid Input");
     } finally {
         sc.close();
     }
 }
}