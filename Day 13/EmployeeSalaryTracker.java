package day13;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Employee {
    int id;
    String department;
    double salary;

    Employee(int id, String department, double salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSalaryTracker {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "HR", 30000));
        employees.add(new Employee(102, "IT", 50000));
        employees.add(new Employee(103, "HR", 35000));
        employees.add(new Employee(104, "Finance", 45000));
        employees.add(new Employee(105, "IT", 60000));

        HashMap<String, Double> deptSalary = new HashMap<>();
        for (Employee emp : employees) {
            deptSalary.put(
                emp.department,
                deptSalary.getOrDefault(emp.department, 0.0) + emp.salary
            );
        }

        System.out.println("Total Salary by Department:");
        for (Map.Entry<String, Double> entry : deptSalary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        String highestDept = "";
        double maxSalary = 0;

        for (Map.Entry<String, Double> entry : deptSalary.entrySet()) {
            if (entry.getValue() > maxSalary) {
                maxSalary = entry.getValue();
                highestDept = entry.getKey();
            }
        }

        System.out.println("\nDepartment with Highest Total Salary:");
        System.out.println(highestDept + " -> " + maxSalary);
    }
}