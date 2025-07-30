package project;

import java.util.Scanner;

public class Triangle {

    // Method to calculate the area of a triangle
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;  // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    // Method to calculate the perimeter of a triangle
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Method to check if triangle is valid or not
    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        while (true) {
            // Read side a
            System.out.print("\nEnter side a (enter -1 to exit): ");
            double a = sc.nextDouble();

            // If a is -1, exit the program
            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            // Read sides b and c
            System.out.print("Enter side b: ");
            double b = sc.nextDouble();

            System.out.print("Enter side c: ");
            double c = sc.nextDouble();

            // if triangle is valid
            if (isValid(a, b, c)) {
                // If valid, calculate area and perimeter
                double area = area(a, b, c);
                double perimeter = perimeter(a, b, c);

                System.out.println("The triangle is valid.");
                System.out.println("Area: " + area);
                System.out.println("Perimeter: " + perimeter);
            } else {
                // If not valid, show message
                System.out.println("The input is invalid.");
            }
        }

        sc.close(); // Close scanner
    }
}

/*Enter side a (enter -1 to exit): 2
Enter side b: 4
Enter side c: 5
The triangle is valid.
Area: 3.799671038392666
Perimeter: 11.0

Enter side a (enter -1 to exit): -1
Bye~
*/
