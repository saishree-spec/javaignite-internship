package day12;
import java.io.*;
import java.util.*;
class Book {
    int id;
    String title;
    double price;
    Book(int id, String title, String price) {
        this.id = id;
        this.title = title;
        this.price = Double.parseDouble(price);
    }
    void showBookType() {
        System.out.println("General Book");
    }
}

class EBook extends Book {

    EBook(int id, String title, String price) {
        super(id, title, price);
    }
    void showBookType() {
        System.out.println("E-Book");
    }
}

class PrintedBook extends Book {

    PrintedBook(int id, String title, String price) {
        super(id, title, price);
    }
    void showBookType() {
        System.out.println("Printed Book");
    }
}
class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }
    void searchBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                System.out.println("Book Found:");
                System.out.println("ID: " + b.id);
                System.out.println("Title: " + b.title);
                System.out.println("Price: " + b.price);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void searchBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                System.out.println("ID: " + b.id);
                System.out.println("Title: " + b.title);
                System.out.println("Price: " + b.price);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void saveToFile() throws IOException {
        FileWriter fw = new FileWriter("library.txt");

        for (Book b : books) {
            fw.write(b.id + "," + b.title + "," + b.price + "\n");
        }

        fw.close();
        System.out.println("Book details saved to library.txt");
    }
    void readFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("library.txt"));

        String line;
        System.out.println("\nReading from File:");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
public class DigitalLibrarySystem {
    public static void main(String[] args) {
        try {
            Library lib = new Library();
            EBook e1 = new EBook(101, "Java Basics", "299.50");
            PrintedBook p1 = new PrintedBook(102, "Data Structures", "450");
            lib.addBook(e1);
            lib.addBook(p1);
            e1.showBookType();
            p1.showBookType();
            System.out.println("\nSearch by ID:");
            lib.searchBook(101);

            System.out.println("\nSearch by Title:");
            lib.searchBook("Data Structures");

            // File Handling
            lib.saveToFile();
            lib.readFromFile();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}