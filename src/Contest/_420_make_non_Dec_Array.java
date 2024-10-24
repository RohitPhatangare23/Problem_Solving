package Contest;
import java.util.*;

public class _420_make_non_Dec_Array {
    private int[] lp; // Smallest prime factor
    private List<Integer> pr; // List of prime numbers

    public int minOperations(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int maxVal = 0;

        // Find the maximum value in the array
        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
        }

        // Run the linear sieve to fill 'lp' and 'pr'
        linSieve(maxVal);

        // Process the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            while (nums[i] > nums[i + 1]) {
                if (nums[i] == lp[nums[i]]) return -1;
                nums[i] = lp[nums[i]];
                ans++;
            }
        }

        return ans;
    }

    private void linSieve(int N) {
        lp = new int[N + 1];
        pr = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (lp[i] == 0) {
                lp[i] = i; // Assign smallest prime factor
                pr.add(i); // Add prime number to the list
            }
            for (int j = 0; j < pr.size() && i * pr.get(j) <= N; j++) {
                lp[i * pr.get(j)] = pr.get(j); // Update smallest prime factor
                if (pr.get(j) == lp[i]) break; // Stop if we reach the smallest prime factor
            }
        }
    }

    public static void main(String[] args) {
        _420_make_non_Dec_Array sol = new _420_make_non_Dec_Array();

        // Test case 1
        int[] nums1 = {25, 7};
        System.out.println(sol.minOperations(nums1)); // Output: 1

        // Test case 2
        int[] nums2 = {7, 7, 6};
        System.out.println(sol.minOperations(nums2)); // Output: -1

        // Test case 3
        int[] nums3 = {1, 1, 1, 1};
        System.out.println(sol.minOperations(nums3)); // Output: 0

        // Additional Test case
        int[] nums4 = {30, 28, 29};
        System.out.println(sol.minOperations(nums4)); // Output: 1
    }
}
