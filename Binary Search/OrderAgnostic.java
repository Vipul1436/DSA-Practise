public class OrderAgnostic {
    public static void main(String[] args){
        int[] arr = {80,69,55,47,30,25,8,6,1};
        int target = 69;

        int ans = orderAgnostic(arr, target);
        if(ans == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: " + ans);
        }
        
    }    

    static int orderAgnostic(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start) / 2;

            if (isAsc){
                if(target == arr[mid]){
                    return mid;
                }else if(target > arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target == arr[mid]){
                    return mid;
                }else if(target < arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            
        }
        return -1;
    }
}
