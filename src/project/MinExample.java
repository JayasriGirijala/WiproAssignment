package project;

import java.util.Scanner;

//Functional interface with one abstract method
interface Minimum {
 double minimum3(double a, double b, double c);
}

public class MinExample {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter first number: ");
     double num1 = sc.nextDouble();

     System.out.print("Enter second number: ");
     double num2 = sc.nextDouble();

     System.out.print("Enter third number: ");
     double num3 = sc.nextDouble();

     // Using method reference to call the method
     Minimum min = MinExample::findMinimum;

     // Call the interface method to get the minimum of 3 numbers
     double result = min.minimum3(num1, num2, num3);

     // Print the smallest value
     System.out.println("Smallest value: " + result);
     sc.close();
 }

 // Method to find minimum of 3 using Math.min
 public static double findMinimum(double a, double b, double c) {
     return Math.min(a, Math.min(b, c));
 }
}

/*Enter first number: 7.9
Enter second number: 8.9
Enter third number: 2.78
Smallest value: 2.78
*/