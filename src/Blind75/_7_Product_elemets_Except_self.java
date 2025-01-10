package Blind75;

import java.util.Arrays;

public class _7_Product_elemets_Except_self {
    public static void main(String[] args) {
        int[] number={3,4,6,1,2};
        System.out.println(Arrays.toString(product(number)));
    }

    private static int[] product(int[] number) {
        int[] left=new int[number.length];

        int[] right=new int[number.length];

        left[0]=1;
        for (int i=1;i<number.length;i++){
            left[i]=left[i-1]*number[i-1];
        }
        right[number.length-1]=1;{
            for (int i=number.length-2;i>-1;i--){
                right[i]=right[i+1]*number[i+1];
            }
        }
        int[] ans=new int[number.length];
        for (int i=0;i<number.length;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}
