package LoveBabar_450_DSA.Arrays;

public class _35_Median_of_two_sorted_array {
   //--- [Better Approach] Using Merge of Merge Sort – O(n) Time and O(1) Space
   public static void main(String[] args) {
       int[] arr1 = { 1, 12, 15, 26, 38 };
       int[] arr2 = { 2, 13, 17, 30, 45 };

       System.out.println(getMedian(arr1, arr2));
   }
   static double getMedian(int[] arr1, int[] arr2) {
       int n = arr1.length;
       int i = 0, j = 0;
       int count;

       // m1 to store element at index n of merged array
       // m2 to store element at index (n - 1) of merged array
       int m1 = -1, m2 = -1;

       // Loop till n
       for (count = 0; count <= n; count++) {
           m2 = m1;

           // If both the arrays have remaining elements
           if (i < n && j < n) {
               if (arr1[i] > arr2[j])
                   m1 = arr2[j++];
               else
                   m1 = arr1[i++];
           }

           // If only arr1 has remaining elements
           else if (i < n)
               m1 = arr1[i++];

               // If only arr2 has remaining elements
           else
               m1 = arr2[j++];
       }

       return (m1 + m2) / 2.0;
   }
}
/*
Output = 16
Time Complexity: O(n), where n is the size of array arr1[] and arr2[].
Auxiliary Space: O(1)
 */
