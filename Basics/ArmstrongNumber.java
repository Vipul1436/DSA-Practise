import java.util.*;
public class ArmstrongNumber {

    public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();

    int temp = n;
    int count = 0;

    while(temp>0){
        temp = temp/10;
        count++;
    }

    int num = n;
    double sum = 0;

    while(num>0){

        int r = num%10; 
        num = num/10;
        sum = sum + Math.pow(r,count);
    }

    if(sum == n){
        System.out.println("Number is Armstrong");
    }else{
        System.out.println("Number is not Armstrong");
    }
    }
}
