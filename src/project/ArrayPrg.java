package project;

import java.util.Scanner;

public class ArrayPrg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int[] arr = new int[10];
        int[] freq = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            freq[i] = -1;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] == -1) { 
                int count = 1; 
                for (int j = i + 1; j < 10; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0; 
                    }
                }
                freq[i] = count; 
            }
        }

//for displaying
        System.out.println("Element - Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) { // Skip already-counted duplicates
                System.out.println(arr[i] + " - " + freq[i]);
            }
        }

        sc.close();
    }
}

/*Enter 10 elements:
1 1 2 2 3 3 4 4 5 5
Element - Frequency:
1 - 2
2 - 2
3 - 2
4 - 2
5 - 2
*/
