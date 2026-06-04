package day8assignments;

public class EmployeeSalaryAnalyzer {
	    public static void main(String[] args) {

	        int[] salaries = {25000, 30000, 28000, 35000, 32000};

	        int totalSalary = 0;

	        for (int i = 0; i < salaries.length; i++) {
	            totalSalary += salaries[i];
	        }

	        double averageSalary = (double) totalSalary / salaries.length;

	        System.out.println("Total Salary: " + totalSalary);
	        System.out.println("Average Salary: " + averageSalary);
	    }

}
