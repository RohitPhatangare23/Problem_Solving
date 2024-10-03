package LeetCode_150;

public class _3_Remove_Duplicates_SA {
    public static void main(String[] args) {
        int nums1[]={1,1,2};
        System.out.println(removeDuplicatess(nums1));
    }

    private static int removeDuplicatess(int[] nums1) {
        int count=0;
        for (int i=0;i<nums1.length;i++){
            if (i<nums1.length-1&& nums1[i]==nums1[i+1]){
                continue;
            }
            else {
                nums1[count]=nums1[i];
                count++;
            }
        }
        return  count;
    }
}
