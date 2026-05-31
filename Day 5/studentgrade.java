package day5assignments;
import java.util.Scanner;
public class studentgrade {
	 public static String getGrade(int marks) {

	        if (marks >= 90) {
	            return "A Grade";
	        } else if (marks >= 75) {
	            return "B Grade";
	        } else if (marks >= 50) {
	            return "C Grade";
	        } else {
	            return "Fail";
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        String grade = getGrade(marks);

        System.out.println("Result: " + grade);

        sc.close();

	}

}
