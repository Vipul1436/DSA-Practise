    /**
 * Problem: First Unique Character in a String
 * Platform: LeetCode
 * 
 * Description:
 * Given a string s, return the index of the first non-repeating character.
 * If it does not exist, return -1.
 *
 * Approach:
 * 1. Create a frequency array of size 26 (for lowercase English letters).
 * 2. First pass: Count frequency of each character.
 * 3. Second pass: Traverse the string again and return the first index
 *    whose frequency is exactly 1.
 * 4. If no such character exists, return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)  // constant space (26 letters)
 */

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        // Step 1: Frequency array
        int[] freq = new int[26];

        // Step 2: Count occurrences
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 3: Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // Step 4: If no unique character found
        return -1;
    }
}
