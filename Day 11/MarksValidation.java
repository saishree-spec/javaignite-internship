package day11assignment;
import java.util.Scanner;
class InvalidMarksException extends Exception {
 public InvalidMarksException(String message) {
     super(message);
 }
}

public class MarksValidation {
 public static void validateMarks(int marks)
         throws InvalidMarksException {

     if (marks < 0 || marks > 100) {
         // Using throw
         throw new InvalidMarksException("Invalid Marks");
     }

     System.out.println("Valid Marks");
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Marks: ");
         int marks = sc.nextInt();

         validateMarks(marks);

     } catch (InvalidMarksException e) {
         System.out.println(e.getMessage());
     } catch (Exception e) {
         System.out.println("Invalid Input");
     } finally {
         sc.close();
     }
 }
}