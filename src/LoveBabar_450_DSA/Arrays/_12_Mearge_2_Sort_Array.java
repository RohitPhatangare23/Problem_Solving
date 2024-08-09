package LoveBabar_450_DSA.Arrays;

import java.util.Map;
import java.util.TreeMap;

public class _12_Mearge_2_Sort_Array {
    static void mergeArrays(int a[], int b[], int n, int m)
    {

        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();

        // Inserting values to a map.
        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }

        // Printing keys of the map.
        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int a[] = {1, 3, 5, 7}, b[] = {2, 4, 6, 8};
        int size = a.length;
        int size1 = b.length;

        // Function call
        mergeArrays(a, b, size, size1);
    }
}
/*
Time Complexity: O( nlog(n) + mlog(m) )
Auxiliary Space: O(N)
 */