package LoveBabar_450_DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class _21_subarray_with_0_sum {
    public static void main(String[] args)
    {
        int arr[] = { -3, 2, 3, 1, 6 };
        int N = arr.length;

        // Function call
        if (subArrayExists(arr, N))
            System.out.println("Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");

        //---------------------------------Hashing------------------------------------------
        // Function call
        if (subArrayExists(arr))
            System.out.println(
                    "Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");

    }
    public static boolean subArrayExists(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == 0)
                return true;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0)
                    return true;
            }
        }
        return false;
    }
    /*
    Time Complexity: O(N2)
    Auxiliary Space: O(1)
     */

    // Driver's code

    static Boolean subArrayExists(int arr[])
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}
/*
Time Complexity: O(N) under the assumption that a good hashing function is used, that allows insertion and retrieval operations
                    in O(1) time.
Auxiliary Space: O(N) Here extra space is required for hashing
 */
