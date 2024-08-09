package Accenture;

import java.util.Arrays;

public class _1_SmallLargeSumArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int result = smallLargeSum(arr, arr.length);
        System.out.println("Result: " + result);
    }
    public static int smallLargeSum(int[] arr, int n) {
        if (n <= 3) {
            return 0;
        }

        // Create two arrays to hold even and odd indexed elements
        int evenCount = (n + 1) / 2; // Number of elements at even indices
        int oddCount = n / 2; // Number of elements at odd indices

        int[] arrEven = new int[evenCount];
        int[] arrOdd = new int[oddCount];

        // Populate the even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arrEven[evenIndex++] = arr[i];
            } else {
                arrOdd[oddIndex++] = arr[i];
            }
        }

        // Sort the arrays
        Arrays.sort(arrEven);
        Arrays.sort(arrOdd);

        // If there are less than two elements in any array, return 0
        if (evenCount < 2 || oddCount < 2) {
            return 0;
        }
        // Return the sum of the second largest elements from each array
        return arrEven[evenCount - 2] + arrOdd[oddCount - 2];
    }
}
/*

        Q1) Write a function SmallLargeSum(array) which accepts the array as an argument or parameter,
        that performs the addition of the second largest element from the even location with the second largest
        element from an odd location?

        Rules:
        a. All the array elements are unique.
        b. If the length of the array is 3 or less than 3, then return 0.
        c. If Array is empty then return zero.

        Sample Test Case 1:
        Input:
        6
        3 2 1 7 5 4
        Output:
        7

        Explanation: The second largest element in the even locations (3, 1, 5) is 3.
                    The second largest element in the odd locations (2, 7, 4) is 4.
                    So the addition of 3 and 4 is 7. So the answer is 7.













 */
