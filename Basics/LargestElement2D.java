import java.util.*;
public class LargestElement2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int row = sc.nextInt();

        System.out.println("Enter the no of columns");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];

        System.out.println("Enter the elements of the 2d Array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt(); 
            }
        }

        int largest = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }

        System.out.println("Largest element in the 2D array is: " + largest);
        
    }
}
