package LeetCode_150;

import java.util.HashSet;

import static LeetCode_150._17_Contains_Duplicate.containsNearbyDuplicate;

public class _17_Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Base case...
        if (nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        // Create a Hash Set for storing previous of k elements...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse for all elements of the given array in a for loop...
        for (int j = 0; j < nums.length; j++) {
            // If duplicate element is present at distance less than equal to k, return true...
            if (!hset.add(nums[j])) {
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if (hset.size() >= k + 1) {
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;
    }
}
