package day4assignments;
import java.util.Scanner;
public class Print_sum_until_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum=0,num;
		do {
			System.out.print("Enter a number : ");
			 num = sc.nextInt();
			 if(num>=0)
				 sum+=num;
		}while(num >= 0);
		System.out.print("Sum is "+sum+"\n");
		sc.close();

	}

}
