package LoveBabar_450_DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class _27_Array_SubSet {

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        int m = arr1.length;
        int n = arr2.length;

        //---------------Naive approach
        if (isSubset(arr1, arr2, m, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //----------------[Expected Approach] Using Hashing
        if (isSubsetUsingHashing(arr1, arr2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        // Iterate over each element in the second array
        for (int i = 0; i < n; i++) {
            boolean found = false;
            // Check if the element exists in the first array
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            // If any element is not found, return false
            if (!found) return false;
        }
        // If all elements are found, return true
        return true;
    }
    /*
OUTPUT=Yes
Time Complexity: O(m*n)
Auxiliary Space: O(1)
 */

    public static boolean isSubsetUsingHashing(int[] arr1,
                                               int[] arr2)
    {
        // Create a hash set and insert all elements of arr1
        Set<Integer> hashSet = new HashSet<>();
        for (int num : arr1) {
            hashSet.add(num);
        }

        // Check each element of arr2 in the hash set
        for (int num : arr2) {
            if (!hashSet.contains(num)) {
                return false;
            }
        }

        // If all elements of arr2 are found in the hash set
        return true;
    }
    /*
    Time Complexity: O(m + n), where m and n are the size of arr1 and arr2 respectively.
    Auxiliary Space: O(m)
     */
}

