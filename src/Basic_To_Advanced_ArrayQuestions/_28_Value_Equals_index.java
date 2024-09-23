package Basic_To_Advanced_ArrayQuestions;

import java.util.Arrays;

public class _28_Value_Equals_index {
    public static void main(String[] args) {
        int[] arr={10,2,80,70,66};
        //System.out.println(Arrays.toString(arr));
        int n=arr.length;
        System.out.println(linrearSearch(arr,n));
    }

    public static int linrearSearch(int array[],int n){
        for (int i=0;i<n;i++){
            if (array[i]==i+1){
                return i;
            }
        }
        return -1;
    }
}
