import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args){
        int [][] arr = {
            {1, 3, 5, 8},
            {5, 6, 8, 10},
            {7, 10, 12, 15},
            {11, 16, 20, 25}
        };

        int target = 10;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int [] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(target == arr[row][col]){
                return new int[]{row, col};
            }

            if(target > arr[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
