// Calculate sum of each row in a 2D array

import java.util.*;
public class SumOfEachRow {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }

            System.out.println("Sum of row " + (i+1) + " is: " + sum);
            sum = 0;
        }
    }
}
