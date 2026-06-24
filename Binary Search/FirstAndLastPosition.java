// Find First and Last Position of Element in Sorted Array (LeetCode 34)
// Given a sorted array and a target value,
// return the first and last occurrence of the target.
// If the target does not exist, return [-1, -1].
// Use Binary Search to find both positions efficiently.

import java.util.*;
public class FirstAndLastPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements of the array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to find: ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] arr, int target){
        int firstIndex = search(arr, target, true);
        int lastIndex = search(arr, target, false);

        return new int[]{firstIndex, lastIndex};
        
    }

    static int search(int[] arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){

            int mid = start + (end - start)/2;
            
            if(target == arr[mid]){
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    
}
