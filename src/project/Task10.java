package project;
import java.util.Scanner;



public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Eggs : ");
        int totalEggs = sc.nextInt();

        int gross = totalEggs / 144;
        int remainingAfterGross = totalEggs % 144;

        int dozen = remainingAfterGross / 12;
        int remaining = remainingAfterGross % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + remaining + " eggs.");

        sc.close();
    }
}
/*Enter the Number of Eggs : 
234
Your number of eggs is 1 gross, 7 dozen, and 6 eggs.*/