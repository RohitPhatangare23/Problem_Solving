package LeetCode_150;

import java.util.Scanner;

public class _1_Remove_Element {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Length");
        int n=in.nextInt();
        System.out.println("Enter Elements :");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int val=3;
        System.out.println(RemoveElements(arr,val));
    }

    private static int RemoveElements(int[] arr, int val) {
        int i = 0,j=0;
        while (i< arr.length){
            if (arr[i]!=val){
                arr[j]=arr[i];
                j+=1;
            }
            i+=1;
        }
        return j;
    }
}
