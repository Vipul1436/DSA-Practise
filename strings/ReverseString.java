/*
Problem: Reverse String
Platform: LeetCode
Link: https://leetcode.com/problems/reverse-string/

Approach:
- Use two-pointer technique.
- One pointer starts from beginning (i).
- Other pointer is calculated as (n - 1 - i).
- Swap elements until i < n/2.

Time Complexity: O(n)
Space Complexity: O(1)  // In-place reversal
*/

public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;

        for(int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
    }
} 
