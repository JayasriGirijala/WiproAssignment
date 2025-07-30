package project;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double totalRetailValue = 0.0;

        System.out.print("Enter the number of products to be entered: ");
        int total = scanner.nextInt();

        while (count < total) {
            System.out.print("Enter product number 1, 2, or 3: ");
            int productNumber = scanner.nextInt();

            System.out.print("Enter quantity sold: ");
            int quantity = scanner.nextInt();

            double price = 0.0;

            switch (productNumber) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number! Skipping entry.");
                    continue; 
            }

            double subtotal = price * quantity;
            totalRetailValue += subtotal;

            System.out.printf("Subtotal for Product %d: )", productNumber,+subtotal);

            count++;
        }

        System.out.printf("Total retail value of all products sold: )"+ totalRetailValue);
        scanner.close();
    }
}


