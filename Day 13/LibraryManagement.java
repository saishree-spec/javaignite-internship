package day13;
import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/library_db";
        String user = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();

            // SELECT query to check availability
            String selectQuery = "SELECT available_copies FROM books WHERE book_id = ?";
            PreparedStatement ps1 = con.prepareStatement(selectQuery);
            ps1.setInt(1, bookId);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                int copies = rs.getInt("available_copies");

                if (copies > 0) {

                    // UPDATE query to reduce copies by 1
                    String updateQuery =
                            "UPDATE books SET available_copies = available_copies - 1 WHERE book_id = ?";

                    PreparedStatement ps2 = con.prepareStatement(updateQuery);
                    ps2.setInt(1, bookId);

                    int rows = ps2.executeUpdate();

                    if (rows > 0) {
                        System.out.println("Book Issued");
                    }
                } else {
                    System.out.println("Not Available");
                }

            } else {
                System.out.println("Book ID not found");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}