//Count even and odd number of elements in the array

import java.util.*;
public class EvenAndOddCounter {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }           
        }

        System.out.println("No of odd elements in the array is: " + odd);
        System.out.println("No of even elements in the array is: " + even);

    }
}
