// Find the Peak Index in a Mountain Array using Binary Search
// A mountain array first increases and then decreases.
// Compare the middle element with the next element to determine
// which side contains the peak.
// Continue narrowing the search until the start and end pointers
// meet at the peak index.
// Return the index of the peak element.

public class MountainArray {

    public static void main(String[] args) {
     
        int[] arr = {0,1,2,3,5,6,7,84,2,1,0};
        int ans  = findpeakIndex(arr);
        System.out.println(ans);

    }

    static int findpeakIndex(int[] arr){
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
