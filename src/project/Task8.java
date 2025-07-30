package project;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
7.A student will not be allowed to sit in exam if his/her attendence is less than 70%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

8.Modify the above question to allow student to sit if he/she has medical cause.
 Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of classes held :");
		int total=sc.nextInt();
		System.out.println("Enter Number of classes attended :");
		int Attended=sc.nextInt();
		double percentage=((double)Attended/total)*100;
		
		System.out.println("Attendence percentage: "+percentage);
		if(percentage>70) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Do you have Medical Cause: ");
			String medical_cause=sc.next();
			sc.nextLine();
			if(medical_cause.equals("Y")) {
				System.out.println("You are Eligible");
			}
			else {
				System.out.println("You are not Eligible");
			}
		}
		
		
		sc.close();


	}

}/*Enter Number of classes held :
5
Enter Number of classes attended :
3
Attendence percentage: 60.0
Do you have Medical Cause: 
Y
You are Eligible
*/
