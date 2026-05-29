package day4assignments;
import java.util.Scanner;
public class Retry_simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Cpin= 963612,pin;
		do {
		System.out.print("Enter PIN → ");
		pin=sc.nextInt();
		}while(Cpin!=pin);
		sc.close();

	}

}
