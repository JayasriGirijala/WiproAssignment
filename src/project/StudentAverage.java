package project;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark;
        int total = 0;
        int studentCount = 3;

        for (int i = 1; i <= studentCount; i++) {
            while (true) {
                System.out.print("Enter the mark (0-100) for student " + i + ": ");
                mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    total += mark;
                    break; // valid input, exit the loop
                } else {
                    System.out.println("Invalid input, try again...");
                }
            }
        }

     
        double average = (double) total / studentCount;

        
        System.out.printf("The average is: "+ average);

        sc.close();
    }
}
/*Enter the mark (0-100) for student 1: 67
Enter the mark (0-100) for student 2: 89
Enter the mark (0-100) for student 3: 90
The average is: 82.00
*/
