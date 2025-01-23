package Blind75;

public class _18_Largest_Subarray_1_After_Deleting {
    public static void main(String[] args) {
        int[] nums={1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int ans=0;
        int i=0;
        int j=-1;
        int count=0;
        while(i<nums.length){
            //acquire
            if (nums[i]==1){
                i++;
            }else{
                i++;
                count++;
            }
            //release if valid

            while (count>1 && j<i){
                j++;
                if (nums[j]==0){
                    count--;
                }
            }
            ans=Math.max(ans,i-j-1);
        }
        return ans-1;

    }
}
