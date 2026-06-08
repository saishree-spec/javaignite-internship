package day11assignment;
import java.util.Scanner;

//Custom Exception for marks > 100
class InvalidMarksException extends Exception {
 public InvalidMarksException(String message) {
     super(message);
 }
}

//Custom Exception for negative marks
class NegativeMarksException extends Exception {
 public NegativeMarksException(String message) {
     super(message);
 }
}

public class StudentResult {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Student ID: ");
         String studentId = sc.nextLine();

         // Nested try-catch block
         try {
             if (studentId == null || studentId.trim().isEmpty()) {
                 throw new NullPointerException("Student ID is null");
             }

             System.out.print("Enter Marks (out of 100): ");
             double marks = sc.nextDouble();

             if (marks < 0) {
                 throw new NegativeMarksException(
                         "Negative marks are not allowed");
             }

             if (marks > 100) {
                 throw new InvalidMarksException(
                         "Marks cannot exceed 100");
             }

             double percentage = marks; // out of 100
             System.out.println("Percentage = " + percentage + "%");

         } catch (NullPointerException e) {
             System.out.println(e.getMessage());
         } catch (NegativeMarksException e) {
             System.out.println(e.getMessage());
         } catch (InvalidMarksException e) {
             System.out.println(e.getMessage());
         }

     } catch (Exception e) {
         System.out.println("Invalid Input");
     } finally {
         sc.close();
     }
 }
}