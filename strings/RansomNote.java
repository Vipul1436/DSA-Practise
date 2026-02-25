/*
 Problem: Ransom Note

 Platform: LeetCode
 Link: https://leetcode.com/problems/ransom-note/
 
 Description:
 Given two strings ransomNote and magazine, return true if ransomNote
 can be constructed using the letters from magazine.
 Each letter in magazine can only be used once.

 Approach:
 1. If ransomNote length is greater than magazine length → return false.
 2. Create a frequency array of size 26 (for lowercase English letters).
 3. Count the frequency of characters in magazine.
 4. Traverse ransomNote and decrement the corresponding frequency.
 5. If at any point frequency becomes negative → return false.

 Time Complexity: O(n + m)
 Space Complexity: O(1)
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']--;
            if (freq[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
