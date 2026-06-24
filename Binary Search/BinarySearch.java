// Binary Search

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,4,6,7,9,14,15,20,23,30,55,69,79};
        int target = 689;

        int ans = binarySearch(arr, target);
        if(ans == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: " + ans);
        }
        
    }    

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
