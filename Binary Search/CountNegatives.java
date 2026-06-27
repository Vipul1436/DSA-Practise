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
