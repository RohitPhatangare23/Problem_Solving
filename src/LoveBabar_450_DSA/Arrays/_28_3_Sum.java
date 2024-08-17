package LoveBabar_450_DSA.Arrays;

public class _28_3_Sum {
    // Driver program to test above functions
    public static void main(String[] args) {
        _28_3_Sum triplet = new _28_3_Sum();
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = A.length;

        triplet.find3Numbers(A, arr_size, sum);
    }

    boolean find3Numbers(int A[], int arr_size, int sum) {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }
}
/*
Output= Triplet is 4, 10, 8

Complexity Analysis:
Time Complexity: O(n3), There are three nested loops traversing the array, so the time complexity is O(n^3)
Auxiliary Space: O(1), As no extra space is required.
 */


