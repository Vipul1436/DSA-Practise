// Floor of a Number using Binary Search
// The floor is the largest element <= target.
// Use Binary Search to reduce the search space.
// If the target is not found, the end pointer
// will point to the floor element.

public class FloorBS {
    public static void main(String[] args) {
        int [] arr = {1,5,15,20,27,35,38,45};
        int target = 100;

        int ans = floor(arr, target);

        if(ans == -1){
            System.out.println("Floor does not exist");
        }else{
            System.out.println("Floor of " + target + " is " + ans);
        }
    } 
  
        static int floor(int [] arr, int target){

            int start = 0;
            int end = arr.length-1;

            if(target < arr[start]){
                return -1;
            }

            while(start <= end){

                int mid = start + (end - start)/2;

                if(target == arr[mid]){
                    return arr[mid];
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return arr[end];
        }

} 
