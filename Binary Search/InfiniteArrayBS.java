import java.util.*;
public class InfiniteArrayBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();      
        }

        System.out.print("Enter the element you want to find: ");
        int target = sc.nextInt();

        int ans = findIndex(arr, target);
        System.out.println(ans);

    }

    static int findIndex(int[] arr, int target){
        int start = 0;
        int end = 1;
        if(target > arr[arr.length - 1]){
            return -1;
        }

        while(target > arr[end]){
            int newStart = end + 1;
            end = Math.min(end + (end - start + 1) * 2, arr.length - 1);
            start = newStart;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }
}
