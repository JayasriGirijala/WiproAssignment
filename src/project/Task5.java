package project;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.A company decided to give bonus of 10% to employee if his/her year of service is more than 6 years.
		//Ask user for their salary and year of service and print the net bonus amount.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary ");
		int salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter years of experience");
		int exp=sc.nextInt();
		sc.nextLine();
		double bonus=salary*0.10;
		if (exp>6) {
			System.out.println("The net bonous is : "+bonus);
		}else {
			System.out.println("No Bonus since your eexperience is  less than 6");
		}
		


	}
}
/*Enter salary 
50000
Enter years of experience
8
The net bonous is : 5000.0
*/
