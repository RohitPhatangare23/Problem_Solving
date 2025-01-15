package Blind75;

import java.util.Arrays;

public class _14__Target_Sum {
    public static void main(String[] args) {
        int[] n={1,2,3,4};
        int k=5;
        int result_count=target_sum(n,k);
        System.out.println(result_count);
    }
    public static int target_sum(int[] num,int k){
        int count=0;
        Arrays.sort(num);
        int left=0;
        int right=num.length-1;
        while (left < right) {
            if (num[left]+num[right]<k){
                left++;
            }
            else if (num[left]+num[right]>k){
                right--;
            }
            else {
                left++;
                right--;
                count++;
            }

        }
        return count;
    }
}
