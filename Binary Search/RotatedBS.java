public class RotatedBS {
    public static void main(String[] args) {
        int [] arr = {7,8,9,1,2,3,4,5,6};
        int target = 2;
        int ans = search(arr, target);

        System.out.println(ans);
        
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        int firstSearch = binarySearch(arr, target, 0, pivot);
        if(firstSearch != -1){
            return firstSearch;
        }else{
            int secondSearch = binarySearch(arr, target, pivot+1, arr.length - 1);
            return secondSearch;
        }

    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                return mid;
            }else if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }else if(arr[start] > arr[mid]){
                end = mid - 1;
            }else if(arr[end] < arr[mid]){
                start = mid + 1;
            }
        }
        return 0;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

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
