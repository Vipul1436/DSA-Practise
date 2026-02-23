// PROBLEM : Remove Duplicates from Sorted Array
// Appraoch : Use Two Pointer Technique
// Time Complexity : O(n)
//  Space Complexity : O(n)



import java.util.*;
public class RemoveDuplicates {
    
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 8};

        int[] res = new int[arr.length];
        int k = 0;

        res[k] = arr[0];
        k++;

        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                res[k] = arr[i];
                k++;
            }
            
        }
        System.out.println("Number of unique elements : " + k);
        System.out.println("Array after removing duplicates : "+Arrays.toString(res));


    }
}
