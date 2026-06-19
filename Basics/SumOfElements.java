// Find sum of all the elements of any array

import java.util.*;
public class SumOfElements {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of elements of the array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");

        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        System.out.println("Sum of the elements of array is " + sum);


    }
}
