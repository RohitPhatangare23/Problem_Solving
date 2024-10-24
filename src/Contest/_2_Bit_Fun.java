package Contest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2_Bit_Fun {
    public static void main(String[] args) {
        // Sample input
        int k = 3;
        int bitmask = 15;
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 6, 1, 2);
        int target = 5;

        // Call the function and print the result
        System.out.println(xor_magic(k, bitmask, ar, target));  // Expected output: 2
    }
    public static int xor_magic(int k, int b, List<Integer> ar, int t) {
        Set<List<Integer>> uniqueSubarrays = new HashSet<>();
        int n = ar.size();

        for (int i = 0; i <= n - k; i++) {
            int xorResult = 0;

            // Compute the XOR of the current subarray of length k
            for (int j = i; j < i + k; j++) {
                xorResult ^= ar.get(j);
            }

            // Apply the bitmask to the XOR result
            xorResult &= b;

            // Check if the result equals the target
            if (xorResult == t) {
                // Add the subarray to the set of unique subarrays
                uniqueSubarrays.add(ar.subList(i, i + k));
            }
        }

        // Return the number of unique subarrays
        return uniqueSubarrays.size();
    }


}
