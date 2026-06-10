package day14;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMarksLookup {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "John");
        students.put(102, "Priya");
        students.put(103, "Rahul");
        students.put(104, "David");
        students.put(105, "Anu");

        System.out.println("Student Records:");
        System.out.println(students);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        if (students.containsKey(studentId)) {

            String studentName = students.get(studentId);

            System.out.println("Student Name: " + studentName);

        } else {

            System.out.println("Student Not Found");

        }

        sc.close();
    }
}