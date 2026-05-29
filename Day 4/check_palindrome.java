package day4assignments;
import java.util.Scanner;
public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int temp=num,sum=0;
		while(temp!=0) {
			int d= temp%10;
			sum=sum*10+d;
			temp/=10;
		}
		if(num==sum) {
			System.out.print(+num+" is a Pallindrome");
		}
		else {
			System.out.print(+num+" is not a Pallindrome");
		}
		sc.close();

	}

}
