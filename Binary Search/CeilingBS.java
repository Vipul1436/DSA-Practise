// Ceiling of a Number using Binary Search
// The ceiling is the smallest element >= target.
// Use Binary Search to reduce the search space.
// If the target is not found, the start pointer will point to the ceiling element.


public class CeilingBS {

    public static void main(String[] args) {

        int [] arr = {2,15,18,20,30};
        int target = 19;

        int ans = ceiling(arr, target);
        System.out.println("Ceiling of " + target + " is " + arr[ans]);
        
    }

    static int ceiling(int [] arr, int target){

        int start = 0;
        int end = arr.length -1;

        if(target > arr[arr.length - 1]){
            return -1;
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
        
        return start;
    }
    
}
