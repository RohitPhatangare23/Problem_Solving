package LeetCode_150;

public class _4_Remove_Duplicates_SA_II {
    public static void main(String[] args) {
        int nums1[]={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicate(nums1));
    }

    private static int  removeDuplicate(int[] nums1) {
        int i=0;
        for (int n:nums1){
            if (i<2 || n!=nums1[i-2]){
                nums1[i++]=n;
            }
        }
        return i;
    }
}
