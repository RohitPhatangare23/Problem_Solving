package Basic_To_Advanced_ArrayQuestions;

import java.util.Arrays;

public class _14_Remove_all_occurence {
    public static void main(StringHackerRank[] args) {
        int[] arr={ 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key=2;
        arr=removeElement(arr,key);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] removeElement(int[] arr, int key) {
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=key){
                arr[index++]=arr[i];
            }
        }
        return Arrays.copyOf(arr,index);
    }
}
