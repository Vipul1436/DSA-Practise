/* 
PROBLEM : Rotate Array(Right Rotation)
DESCRIPTION
Given an integer array and an integer k,
Rotate array to right by k steps

APPROACH:
-Store last k elements in a temporary array
-Shift remaining elements to right by k steps
-place stored elements at the beginning

TIME COMPLEXITY : O(N)
SPACE COMPLEXITY : O(K)
*/

import java.util.*;
public class RotateArray {

    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int n = arr.length;
        k = k % n;

        int [] temp = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = arr[n-k+i];
        }

        for(int i=n-k-1; i>=0; i--){
            arr[i+k] = arr[i];
        }

        for(int i=0; i<k; i++){
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
