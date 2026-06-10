package day13;
import java.sql.*;

public class StudentAboveAverage {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college_db";
        String user = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 1: Calculate average marks
            String avgQuery = "SELECT AVG(marks) AS avg_marks FROM students";
            Statement st1 = con.createStatement();

            ResultSet rs1 = st1.executeQuery(avgQuery);

            double average = 0;

            if (rs1.next()) {
                average = rs1.getDouble("avg_marks");
            }

            System.out.println("Average Marks = " + average);

            // Step 2: Fetch all students
            String selectQuery = "SELECT * FROM students";
            Statement st2 = con.createStatement();

            ResultSet rs2 = st2.executeQuery(selectQuery);

            int count = 0;

            System.out.println("\nStudents scoring above average:");

            while (rs2.next()) {

                count++;

                int id = rs2.getInt("id");
                String name = rs2.getString("name");
                double marks = rs2.getDouble("marks");

                if (marks > average) {
                    System.out.println(
                        "ID: " + id +
                        ", Name: " + name +
                        ", Marks: " + marks
                    );
                }
            }

            System.out.println("\nTotal Students Processed: " + count);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}