public class SearchInMountainArray {
   public static void main(String[] args) {
     
        int[] arr = {1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        int target = 9;

        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){
        int peak = peakIndex(arr, target);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if(firstTry != -1){
            return firstTry;
        }else{
            int secondTry = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
            return secondTry;
        }
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    
}
