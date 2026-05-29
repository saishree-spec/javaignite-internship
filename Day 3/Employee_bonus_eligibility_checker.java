package day_3_assignments;
import java .util.Scanner;

public class Employee_bonus_eligibility_checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the years of experience");
		int experience =sc.nextInt();
		System.out.println("enter attendance percentage");
		double attendance = sc.nextDouble();
		System.out.println("enter the performance rating(1-5)");
		int rating = sc.nextInt();
		int bonus =0;
		if (attendance < 60)
			System.out.println("not eligible");
		else if(experience > 3 && attendance > 85 )
			switch(rating) {
             case 5:
                 bonus = 50000;
                 break;
             case 4:
                 bonus = 30000;
                 break;
             case 3:
                 bonus = 10000;
                 break;
             default:

                 bonus = 0;
         }

         if (bonus > 0) {
             System.out.println("Eligible");
             System.out.println("Bonus Amount = ₹" + bonus);
         } else {
             System.out.println("Not Eligible");
         }
        sc.close();
	}
}
          

         

