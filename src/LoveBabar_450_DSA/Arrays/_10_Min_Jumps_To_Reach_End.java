package LoveBabar_450_DSA.Arrays;

public class _10_Min_Jumps_To_Reach_End {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        // calling minJumps method
        System.out.println(minJumps(arr));
    }

    static int minJumps(int arr[]) {
        if (arr.length <= 1)
            return 0;

        //If value of first index guarantees
        //only 1 jump is needed, return 1
        if (arr[0] >= arr.length - 1)
            return 1;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;

        // initialization
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        // Start traversing array
        for (int i = 1; i < arr.length; i++) {
            // Check if we have reached
// the end of the array
            if (i == arr.length - 1)
                return jump;

            //Check if value at current index guarantees jump to end
            if (arr[i] >= (arr.length - 1) - i)
                return jump + 1;

            // updating maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0) {
                // we must have used a jump
                jump++;

                // Check if the current
                // index/position or lesser index
                // is the maximum reach point
                // from the previous indexes
                if (i >= maxReach)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }
        return -1;
    }
}

/*
Time complexity: O(n), Only one traversal of the array is needed.
Auxiliary Space: O(1), There is no space required.
 */