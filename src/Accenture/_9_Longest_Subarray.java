package Accenture;
import java.util.*;

public class _9_Longest_Subarray {
    static int findLongestSubarray(List<Integer> arr) {
        int maxLength = 0;
        int left = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < arr.size(); right++) {
            int currentNum = arr.get(right);
            freqMap.put(currentNum, freqMap.getOrDefault(currentNum, 0) + 1);

            // Shrink the window if the map contains more than 2 keys or if the keys differ by more than 1
            while (freqMap.size() > 2 ||
                    (freqMap.size() == 2 && Math.abs(Collections.max(freqMap.keySet()) - Collections.min(freqMap.keySet())) > 1)) {
                int leftNum = arr.get(left);
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
                left++;
            }

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1,2,3,4,5);
        List<Integer> arr2 = Arrays.asList(2,2,1);

        System.out.println("Longest subarray length for arr1: " + findLongestSubarray(arr1)); // Output: 4
        System.out.println("Longest subarray length for arr2: " + findLongestSubarray(arr2)); // Output: 4
    }
}
