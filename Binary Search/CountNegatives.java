// Count Negative Numbers in a Sorted Matrix (LeetCode 1351)
// The matrix is sorted in non-increasing order both row-wise and column-wise.
// Start from the top-right corner of the matrix.
// If the current element is non-negative, move down to the next row.
// If the current element is negative, all elements below it in the same column
// are also negative. Count them using (rows - currentRow) and move left.
// Return the total number of negative numbers.


// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/2047456314/

public class CountNegatives {
    public static void main(String[] args) {
        int[][] arr = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        System.out.println(countNegatives(arr));
    }

    static int countNegatives(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length - 1;

        int count = 0;
        int row = 0;

        while(row < arr.length && cols >= 0){
            if(arr[row][cols] >= 0){
                row++;
            }else{
                count += rows - row;
                cols--;
            }
        }
        return count;
    }
}
