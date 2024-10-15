package Practice.Easy;

import java.util.Arrays;

public class _1_Third_Max_Num {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        System.out.println(TMN(nums));
    }

    private static int TMN(int[] nums) {
        int n=nums.length;
        int count=1;
        Arrays.sort(nums);
        for (int i=n-1;i>=1;i--){
            if (nums[i] != nums[i-1]){
                count++;
            }
            if (count == 3){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}
