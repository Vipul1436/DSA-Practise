/*
Problem: Valid Palindrome

Description:
Given a string, determine whether it is a palindrome,
considering only alphanumeric characters and ignoring cases.

Approach:
- Use Two Pointer technique.
- One pointer starts from left, one from right.
- Skip non-alphanumeric characters.
- Compare lowercase characters.
- Return false on mismatch.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Practise{

    public static void main(String[] args) {
        Practise obj = new Practise();
        String s = "A man, a plan, a canal: Panama";

        System.out.println(obj.isPalindrome(s));
    }


    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters in the starting
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters in the end
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare lowercase versions
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}