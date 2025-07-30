package project;
import java.util.Scanner;

interface PerformOperation {
    boolean check(int a);
}

public class LambdaOperations {  // Lambda to check if a number is odd
    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }
// Lambda to check if a number is prime
    public static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }
// Lambda to check if a number is a palindrome
    public static PerformOperation isPalindrome() {
        return n -> {
            String str = Integer.toString(n);
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
    }

    public static void main(String[] args) {
 // Testing the lambdas

    	PerformOperation odd = isOdd();
        PerformOperation prime = isPrime();
        PerformOperation palindrome = isPalindrome();

        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        

        System.out.println(num + " is odd? " + odd.check(num));
        System.out.println(num + " is prime? " + prime.check(num));
        System.out.println(num + " is palindrome? " + palindrome.check(num));
        sc.close();
    }

}
/*Enter number: 
121
121 is odd? true
121 is prime? false
121 is palindrome? true*/
    
