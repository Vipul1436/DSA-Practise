//Code for Prime numbers in a given range

import java.util.*;
public class PrimeNumbers {

    //Checks a number is prime 
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    // Checks the numbers in the given range
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    // Print the prime numbers
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeInRange(n);
    }
}
