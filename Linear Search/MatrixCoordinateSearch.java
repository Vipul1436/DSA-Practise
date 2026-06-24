// Find the coordinates of a element in the given matrix

import java.util.*;
public class MatrixCoordinateSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the no of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element you want to find: ");
        int target = sc.nextInt();

        int[] ans = coordinate(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] coordinate(int [][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( target == arr[i][j]){
                    return new int[]{i,j}; 
                }
            }
            
        }

        return new int[]{-1,-1};
    }
}
