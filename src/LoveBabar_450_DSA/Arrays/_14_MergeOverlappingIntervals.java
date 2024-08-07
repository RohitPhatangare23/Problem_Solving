package LoveBabar_450_DSA.Arrays;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    int start, end;

    Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}

public class _14_MergeOverlappingIntervals {

    // Function that takes a set of _14_Intervalss, merges
    // overlapping _14_Intervalss and prints the result
    public static void merge_14_Intervalss(Interval arr[])
    {
        // Sort _14_Intervalss in increasing order of
        // start time
        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2)
            {
                return i1.start - i2.start;
            }
        });

        int index = 0; // Stores index of last element
        // in output array (modified arr[])

        // Traverse all input _14_Intervalss
        for (int i = 1; i < arr.length; i++) {
            // If this is not first _14_Intervals and overlaps
            // with the previous one
            if (arr[index].end >= arr[i].start) {
                // Merge previous and current _14_Intervalss
                arr[index].end
                        = Math.max(arr[index].end, arr[i].end);
            }
            else {
                index++;
                arr[index] = arr[i];
            }
        }

        // Now arr[0..index-1] stores the merged _14_Intervalss
        System.out.print("The Merged _14_Intervalss are: ");
        for (int i = 0; i <= index; i++) {
            System.out.print("[" + arr[i].start + ","
                    + arr[i].end + "]");
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        merge_14_Intervalss(arr);
    }
}
/*
Output = The Merged Intervals are: [1, 9]
Time Complexity: O(N*log(N))
Auxiliary Space Complexity: O(1)
 */