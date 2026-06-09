package day12;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void calculateGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
    void displayResult() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    void displayResult(String semester) {
        System.out.println("Semester: " + semester);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GraduateStudent extends Student {

    GraduateStudent(int id, String name, int marks) {
        super(id, name, marks);
    }
    void calculateGrade() {
        if (marks >= 85)
            System.out.println("Grade: A+");
        else if (marks >= 70)
            System.out.println("Grade: A");
        else if (marks >= 55)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}
public class StudentResultArchive {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent(101, "Rahul", 88);
        gs.displayResult();
        System.out.println();

        gs.displayResult("Semester 2");
        System.out.println();
        gs.calculateGrade();

        try {
            FileOutputStream fos = new FileOutputStream("result.txt");

            String data = "ID: " + gs.id +
                          "\nName: " + gs.name +
                          "\nMarks: " + gs.marks;

            fos.write(data.getBytes());
            fos.close();
            System.out.println("\nData saved to result.txt");
            FileInputStream fis = new FileInputStream("result.txt");

            int ch;
            System.out.println("\nReading from file:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}