// Find maximum and minimum element in an array

import java.util.*;

public class MaxElementInArray{

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of elements of array: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Array must contain at least one element");
            return;
        }

        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        for(int i=1; i<n; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Maximum element of array is " + max);
        System.out.println("Minimum element of array is " + min);
    }

}