package project;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*7.A student will not be allowed to sit in exam if his/her attendence is less than 70%.
		Take following input from user
		Number of classes held
		Number of classes attended.
		And print
		percentage of class attended
		Is student is allowed to sit in exam or not.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of classes held :");
		int no_of_classes=sc.nextInt();
		//sc.nextLine();
		System.out.println("Enter Number of classes attended :");
		int Attended=sc.nextInt();
		//sc.nextLine();
		double percentage=((double)(no_of_classes/Attended))*100;
		if(percentage>70) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		
		
		sc.close();

	}
}/*Enter Number of classes held :
5
Enter Number of classes attended :
4
Eligible
*/
