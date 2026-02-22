/*
Problem: Product of Array Except Self

Description:
Given an integer array nums, return an array answer such that
answer[i] is equal to the product of all the elements of nums except nums[i].

Constraints:
- Must run in O(n) time.
- Division is not allowed.

Approach:
- Use prefix (left) product.
- Use suffix (right) product.
- Multiply left and right products for each index.

Time Complexity: O(n)
Space Complexity: O(1) (excluding output array)
*/


import java.util.*;
public class ProductExceptSelf {

    public static void main(String[] args) {
        
        int[] arr = {2, 4, 0, 10, -5};
        
        int left = 1;
        int right = 1;

        int [] result = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            result[i] = left;
            left = left*arr[i];
        }

        for(int i=arr.length-1; i>=0; i--){
            result[i] = result[i]*right;
            right = right*arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
    
}
