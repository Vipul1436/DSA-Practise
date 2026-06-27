// Search in Rotated Sorted Array (LeetCode 33)
// Find the pivot (largest element) in the rotated sorted array using Binary Search.
// If the array is not rotated, perform a normal Binary Search.
// Otherwise, determine which sorted half can contain the target
// and search only in that half using Binary Search.
// Return the index of the target if found; otherwise, return -1.

//  https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/2046354514/


public class RotatedBS {
    public static void main(String[] args) {
        int [] arr = {7,8,9,1,2,3,4,5,6};
        int target = 2;
        int ans = search(arr, target);

        System.out.println(ans);
        
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target){
            return pivot;
        }
        
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
        
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }else if(arr[start] > arr[mid]){
                end = mid - 1;
            }else if(arr[end] < arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
