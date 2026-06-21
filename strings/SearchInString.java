//Searching any character in the string and returning true if present else false

import java.util.*;
public class SearchInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Enter the character you want to find in the string: ");
        char c = sc.next().charAt(0);

        boolean ans = search(str, c);
        System.out.println(ans);
    }
    

    static boolean search(String str, char c){

        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
}
