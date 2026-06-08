package day10_assisgnments;
import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentsMarkSystem {

    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Mark: " + marks[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}