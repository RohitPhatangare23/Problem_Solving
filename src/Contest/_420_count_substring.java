package Contest;

import java.util.HashMap;
import java.util.Map;

public class _420_count_substring {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int count = 0;

        // Sliding window setup
        Map<Character, Integer> freqMap = new HashMap<>();
        int start = 0;

        // Iterate over the end pointer to extend the window
        for (int end = 0; end < n; end++) {
            char endChar = s.charAt(end);
            freqMap.put(endChar, freqMap.getOrDefault(endChar, 0) + 1);

            // While the current window contains a character that appears at least k times
            while (hasAtLeastKOccurrences(freqMap, k)) {
                // All substrings from 'start' to 'end' are valid
                count += n - end;  // All substrings from current 'end' to the end of the string are valid

                // Shrink the window from the left by moving the 'start' pointer
                char startChar = s.charAt(start);
                freqMap.put(startChar, freqMap.get(startChar) - 1);
                start++;
            }
        }

        return count;
    }

    // Helper function to check if any character in the map has a frequency of at least 'k'
    private boolean hasAtLeastKOccurrences(Map<Character, Integer> freqMap, int k) {
        for (int freq : freqMap.values()) {
            if (freq >= k) {
                return true;
            }
        }
        return false;
    }

    // To test the function
    public static void main(String[] args) {
        _420_count_substring solution = new _420_count_substring();
        System.out.println(solution.numberOfSubstrings("abacb", 2)); // Output: 4
        System.out.println(solution.numberOfSubstrings("abcde", 1)); // Output: 15
    }
}
