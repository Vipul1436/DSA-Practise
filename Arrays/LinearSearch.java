import java.util.*;

public class LinearSearch {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements in the array");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to find in the array : ");
        int target = sc.nextInt();

        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    
}
