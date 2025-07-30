package project;

import java.util.Scanner;

public class BikerRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        // Input speeds
        System.out.println("Enter the speeds of 5 bikers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed of biker " + (i + 1) + ": ");
            speeds[i] = sc.nextDouble();
            sum += speeds[i];
        }

        // Calculate average
        double average = sum / 5;
        System.out.println("\nAverage speed: " + average);

        // Print qualifying bikers
        System.out.println("\nBikers who qualified (speed > average):");
        boolean found = false;
        for (double speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No bikers qualified.");
        }

        sc.close();
    }
}
/*Enter the speeds of 5 bikers:
Speed of biker 1: 50
Speed of biker 2: 50
Speed of biker 3: 80
Speed of biker 4: 100
Speed of biker 5: 70

Average speed: 70.0

Bikers who qualified (speed > average):
80.0
100.0
*/