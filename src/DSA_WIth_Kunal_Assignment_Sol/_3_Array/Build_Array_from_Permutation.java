package Question_Array;

import java.util.Arrays;

public class Build_Array_from_Permutation {

    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        //System.out.println(Arrays.toString(a));
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i]=n*(nums[nums[i]]%n)+nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }
        System.out.println(Arrays.toString(nums));


        /*
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<nums.length;i++){
        ans[i]= nums[nums[i]];
        }

        return nums;
         */

    }
}
