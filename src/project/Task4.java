package project;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4.Take name, roll number and field of interest from user and print in the format below :
		//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		String name=sc.nextLine();
		System.out.println("Enter roll number ");
		int rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter field of Intrest ");
		String intrest=sc.nextLine();
		
		System.out.println("Hey, my name is " + name + " and my roll number is " + rollno +
                ". My field of interest are " + intrest + ".");

	}

}
/*Enter name 
Jaya Sri
Enter roll number 
27
Enter field of Intrest 
software
Hey, my name is Jaya Sri and my roll number is 27. My field of interest are software.
*/
