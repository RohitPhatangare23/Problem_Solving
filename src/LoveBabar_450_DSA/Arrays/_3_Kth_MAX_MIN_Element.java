package LoveBabar_450_DSA.Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _3_Kth_MAX_MIN_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Validate input
        if (k > 0 && k <= n) {
            int result = kthSmallest(arr, 0, n - 1, k);
            System.out.println("The " + k + "th smallest element is: " + result);
        } else {
            System.out.println("Invalid input: k should be between 1 and " + n);
        }

        scanner.close();
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            // Partition the array around a random element and
            // get the position of the pivot element in the sorted array
            int pos = randomPartition(arr, l, r);

            // If position is the same as k
            if (pos - l == k - 1) {
                return arr[pos];
            }

            // If position is more, recur for left subarray
            if (pos - l > k - 1) {
                return kthSmallest(arr, l, pos - 1, k);
            }

            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
        }

        // If k is more than the number of elements in the array
        return Integer.MAX_VALUE;
    }

    public static int randomPartition(int[] arr, int l, int r) {
        int n = r - l + 1;
        int pivot = (int) (Math.random() * n);
        swap(arr, l + pivot, r);
        return partition(arr, l, r);
    }

    public static int partition(int[] arr, int l, int r) {
        int x = arr[r], i = l;
        for (int j = l; j < r; j++) {
            if (arr[j] <= x) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
