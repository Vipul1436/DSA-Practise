// Each row represents a customer.
// Each column represents money in a different bank.
// Calculate the sum of each row (customer wealth).
// Keep track of the maximum wealth encountered.
// Return the wealth of the richest customer.

import java.util.*;
public class RichestCustomerWealth {

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

        int ans = sum(arr);
        System.out.println(ans);
    }

    static int sum(int[][] arr){
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j]; 
                
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
    
}
