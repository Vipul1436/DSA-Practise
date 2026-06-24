// Find Numbers with Even Number of Digits (LeetCode 1295)
// Traverse the array and count digits in each number.
// Check whether the digit count is even.
// Return the total count of numbers having an even number of digits.

import java.util.*;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements in array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = evenCounter(arr);
        System.out.println(ans);
    }

    static int evenCounter(int[] arr){
        int count = 0;
        int digits = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            while(n>0){
                n=n/10;
                digits++;
            }
            if(digits%2 == 0){
                count++;
                digits = 0;
            }
        }

        return count;
    }
}