package Basic_To_Advanced_ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Find_Largest_Element {
    public static void main(StringHackerRank[] args) {
        //Q1. Find Largest element in array.
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Largest in given array is " +largestArray(arr)); // T.C = o(n) , S.C= o(1)

        int[] arr2={10,60,400,50};
        int max= Arrays.stream(arr2).max().getAsInt();
        System.out.println("Largest in given array 2 is " +max);

        Arrays.sort(arr2);
        System.out.println("Largest in given array is " +arr2[arr2.length-1]);
    }

    public static int largestArray(int[] arr) {
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
