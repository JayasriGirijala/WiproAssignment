package project;
import java.util.Scanner;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
		System.out.print("Age: ");
		int age=scanner.nextInt();
		System.out.print("Height: ");
		float height=scanner.nextFloat();
		System.out.print("Weight: ");
		float weight=scanner.nextFloat();
		System.out.print("Age: "+age);
		System.out.println();
		System.out.print("Height: "+height);
		System.out.println();
		System.out.print("Weight: "+weight);
		scanner.close();
		

	}

}

/*Age: 21
Height: 5.5
Weight: 52
Age: 21
Height: 5.5
Weight: 52.0*/
