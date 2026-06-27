// Search a 2D Matrix (LeetCode 74)
// Treat the matrix as a single sorted 1D array.
// Perform Binary Search on the virtual array.
// Convert the middle index back to 2D coordinates using:
// row = mid / numberOfColumns
// col = mid % numberOfColumns
// Return index if the target is found; otherwise, return -1, -1.

// https://leetcode.com/problems/search-a-2d-matrix/submissions/2047430429/

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {

    int[][] matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
    };

    int target = 3;

    System.out.println(Arrays.toString(sortedSearch(matrix, target)));
        
    }

    static int[] sortedSearch(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows*cols - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int row = mid/cols;
            int col = mid%cols;

            if(target == matrix[row][col]){
                return new int[]{row, col};
            }

            if(target > matrix[row][col]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return new int[]{-1,-1};
    }
}
