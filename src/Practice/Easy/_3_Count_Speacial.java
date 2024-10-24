package Practice.Easy;

import java.util.HashMap;

public class _3_Count_Speacial {
    public static void main(String[] args) {
        int[] arr={1, 4, 1, 2, 4};
        int k=2;
        System.out.println(countSpecials(arr,k));

    }
    public static int countSpecials(int[] arr, int k) {
        int n = arr.length;
        int target = n / k;  // Calculate n/k

        // Create a HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and count occurrences of each element
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;

        // Check how many elements have a frequency equal to target (n/k)
        for (int freq : frequencyMap.values()) {
            if (freq == target) {
                count++;
            }
        }

        return count; // Return the count of special elements
    }
}
