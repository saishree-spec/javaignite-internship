package day1assignments;
import java.util.Scanner;

public class student_result_analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("student name:");
		String studentname = sc.nextLine();
		System.out.println("enter marks of subject 1:");
		int subject1=sc.nextInt();
		System.out.println("enter marks of subject 2:");
		int subject2 = sc.nextInt();
		System.out.println("enter marks of subject 3:");
		int subject3 = sc.nextInt();
		int totalmarks = subject1+subject2+subject3;
		double average = totalmarks/3;
		System.out.println("\n result ");
		System.out.println("studentname:"+studentname);
		System.out.println("total marks:"+ totalmarks);
		System.out.println("average marks:"+average);
		System.out.println("average > 50:"+(average>50));
		sc.close();	
	}

}
