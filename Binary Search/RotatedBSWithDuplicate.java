// Search in Rotated Sorted Array II (LeetCode 81)
// The array may contain duplicate elements.
// Find the pivot while handling duplicates by skipping equal
// elements from both ends when necessary.
// If the array is not rotated, perform normal Binary Search.
// Otherwise, search in the appropriate sorted half.
// Return true if the target exists; otherwise, return false.

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/2046361823/

public class RotatedBSWithDuplicate {
    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        boolean ans = search(arr, target);

        if (ans) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }
    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Pivot found
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: Pivot found
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }

            // Left side sorted
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }

            // Right side sorted
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return true;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}