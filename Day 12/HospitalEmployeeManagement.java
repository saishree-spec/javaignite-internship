package day12;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Employee {
    int employeeId;
    String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    void displayRole() {
        System.out.println("Employee");
    }
}

class Doctor extends Employee {
    String specialization;

    Doctor(int employeeId, String name, String specialization) {
        super(employeeId, name);
        this.specialization = specialization;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Doctor");
    }
}

class Nurse extends Employee {
    String shift;

    Nurse(int employeeId, String name, String shift) {
        super(employeeId, name);
        this.shift = shift;
    }
    void displayRole() {
        System.out.println("Role: Nurse");
    }
}

public class HospitalEmployeeManagement {

    public static void main(String[] args) {

        Doctor d = new Doctor(101, "Rahul", "Cardiology");
        Nurse n = new Nurse(201, "Priya", "Night");
        Employee e1 = d;
        Employee e2 = n;

        e1.displayRole();
        e2.displayRole();
        try {
            FileWriter fw = new FileWriter("employees.txt");

            fw.write("Doctor Details\n");
            fw.write("ID: " + d.employeeId + "\n");
            fw.write("Name: " + d.name + "\n");
            fw.write("Specialization: " + d.specialization + "\n\n");

            fw.write("Nurse Details\n");
            fw.write("ID: " + n.employeeId + "\n");
            fw.write("Name: " + n.name + "\n");
            fw.write("Shift: " + n.shift + "\n");

            fw.close();

            System.out.println("\nData saved to employees.txt");

            System.out.println("\nReading from file:");

            FileReader fr = new FileReader("employees.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}