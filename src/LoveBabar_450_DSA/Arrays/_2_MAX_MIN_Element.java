package LoveBabar_450_DSA.Arrays;

import java.util.Scanner;

public class _2_MAX_MIN_Element {
    public static void main(String[] args) {
       //Aproch 1 = Sorting

       //Approch 2 =  Maximum and minimum of an array using Linear search:

        int[] A = { 4, 9, 6, 5, 2, 3 };
        int N = A.length;
        System.out.println("Minimum element is: " + setmini(A, N));
        System.out.println("Maximum element is: " + setmaxi(A, N));

    }
    public static int setmini(int[] A, int N)
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }

    public static int setmaxi(int[] A, int N)
    {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] > maxi) {
                maxi = A[i];
            }
        }
        return maxi;
    }

    /*
    OUTPUT : Minimum element is: 2
             Maximum element is: 9

    Time Complexity: O(N)

    Auxiliary Space: O(1)
     */


}
