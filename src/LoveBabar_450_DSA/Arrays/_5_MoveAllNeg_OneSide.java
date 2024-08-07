package LoveBabar_450_DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class _5_MoveAllNeg_OneSide {
    //-----------------Two Pointer Approach: ----------------

    public static void main(String[] args)
    {
        // Drive code
        int[] arr = { -12, 11, -13, -5,6, -7, 5, -3, 11 };

        int arr_size = arr.length;
        // Function Call
        shiftall(arr, 0, arr_size - 1);
        display(arr, arr_size - 1);
    }

    static void display(int[] arr, int right)
    { //// Function to print the array
        for(int i = 0; i <= right; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    static void shiftall(int[] arr, int left, int right)
    {
        // Loop to iterate over the
        // array from left to the right
        while (left <= right)
        {
            // Condition to check if the left
            // and the right elements are
            // negative
            if (arr[left] < 0 && arr[right] < 0)
                left++;
                // Condition to check if the left
                // pointer element is positive and
                // the right pointer element is negative
            else if (arr[left] > 0 && arr[right] < 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // Condition to check if both the
            // elements are positive
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else
            {
                left++;
                right--;
            }
        }
    }
}

/*
        OUTPUT = -12 -3 -13 -5 -7 6 5 11 11
        Time Complexity: O(N)
        Auxiliary Space: O(1)
 */
