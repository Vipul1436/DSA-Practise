// Check if the Array is sorted or not
import java.util.*;

public class SortedArray{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int flag = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                System.out.println("Array is not sorted");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Array is sorted");
        }
    }
}