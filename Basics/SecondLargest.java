// Finding second largest element in the array

import java.util.*;

public class SecondLargest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the arary");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> largest){
                int temp = largest;
                largest = arr[i];
                secondLargest = temp;
            }else if(arr[i]>secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
