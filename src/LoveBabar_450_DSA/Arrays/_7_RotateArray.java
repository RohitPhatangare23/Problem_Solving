package LoveBabar_450_DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;
// -------------------------------TWO Pointer Approch-------------------------
public class _7_RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Elements do you want to Enter");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        rotateArray(arr);

        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));

    }

    public static void rotateArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    /*
    OUTPUT = 5
            1 2 3 4 5
            Given Array is
            [1, 2, 3, 4, 5]
            Rotated Array is
            [5, 1, 2, 3, 4]

    Time Complexity: O(n), as we need to iterate through all the elements. Where n is the number of elements in the array.
    Auxiliary Space: O(1), as we are using constant space.
     */
}
