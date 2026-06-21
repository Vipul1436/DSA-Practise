//Finding minimum and maximum element in a 2D array

import java.util.*;
public class MinMax2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the no of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] ans = minMax(arr);
        System.out.println(Arrays.toString(ans));
        
    }

    static int[] minMax(int[][] arr){

        int min = arr[0][0];
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                min = Math.min(min,arr[i][j]);
                max = Math.max(max,arr[i][j]);
                
            }
        }
        return new int[]{min,max};
    }
    
}
