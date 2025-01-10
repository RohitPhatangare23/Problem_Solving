package Blind75;

public class _3_Split_Array {
    public static void main(String[] args) {
        int[] nums={2,3,1,0};
        System.out.println(splitArray(nums));
    }
    public static int splitArray(int[] nums){
        long leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int validSplits = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum) {
                validSplits++;
            }
        }

        return validSplits;
    }
}
