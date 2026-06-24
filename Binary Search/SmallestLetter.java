// Find Smallest Letter Greater Than Target (LeetCode 744)
// Given a sorted array of letters, find the smallest letter
// that is strictly greater than the target.
// If no such letter exists, wrap around and return the first letter.

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'g'};
        char target = 'c';

        char ans = smallestLetter(arr, target);
        System.out.println("The Smallest Letter greater than " + target + " is: " + ans);
    }

    static char smallestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}