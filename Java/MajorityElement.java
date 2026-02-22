// Problem : Malority Element
// Appraoch : Moore's Voting Algorithm
// Time Complexity : O(n)
// Space complexity : O(1)

// Descritpion : 
// Find the element that appeared more than n/2 times in the array
// The solution uses cancelled principle

public class MajorityElement {

    public static void main(String[] args) {
        int [] arr = {3, 3, 4};

        int currElement = arr[0];
        int count = 0;

        for(int i=0; i<arr.length; i++){

            if(count == 0){
                currElement = arr[i];
                count = 1;
            }else if(arr[i] == currElement){
                count++;
            }else{
                count--;
            } 
        }
        System.out.println(currElement);
    }
}
