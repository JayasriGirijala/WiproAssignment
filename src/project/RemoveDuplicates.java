package project;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Given input array
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // to remove duplicates
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : input) {
            uniqueSet.add(num);
        }

        int evenSum = 0;
        for (int num : uniqueSet) { // // Iterate through the set to find sum of even numbers
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        System.out.println("Sum of even numbers after removing duplicates: " + evenSum);
    }
}
//Sum of even numbers after removing duplicates: 62