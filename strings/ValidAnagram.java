/**
 * Problem: Valid Anagram
 * Platform: LeetCode
 * 
 * Description:
 * Given two strings s and t, return true if t is an anagram of s,
 * and false otherwise.
 *
 * An anagram is a word formed by rearranging the letters of another word,
 * using all the original letters exactly once.
 *
 * Approach:
 * 1. If lengths are different → cannot be an anagram.
 * 2. Use a frequency array of size 26 (for lowercase English letters).
 * 3. Increment frequency for characters in s.
 * 4. Decrement frequency for characters in t.
 * 5. If all values in frequency array are zero → valid anagram.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)  // constant space (26 letters)
 */

class ValidAnagram {
    
    public boolean isAnagram(String s, String t) {
        
        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] freq = new int[26];

        // Step 3: Update frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // Step 4: Validate all counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}