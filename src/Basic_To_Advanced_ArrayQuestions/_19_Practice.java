package Basic_To_Advanced_ArrayQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _19_Practice {
    public static void main(StringHackerRank[] args) {
//        int a[] = new int[3];
//        a[0]=55;
//        a[1]=55;
//        a[2]=55;
//        System.out.println(Arrays.toString(a));
//        //a[3]=33; // ERROR
//        int arr[]=new int[a.length];
//        arr[1]=48;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(a.length);

        Scanner in=new Scanner(System.in);
        System.out.println("Size of Array :");
        int n= in.nextInt();
        System.out.println("Enter Array : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
//        System.out.println(range_sum(arr,1,3));
//        System.out.println(range_sum(arr,2,4));


        //Buffer reader
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
                int a= Integer.parseInt(reader.readLine());
                int b= Integer.parseInt(reader.readLine());
                System.out.println(a+" "+b);
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }

    private static int  range_sum(int[] arr, int i,int j) {

        int sum=0;
        for (int k=i;k<=j;k++)
            sum=sum+arr[k];

        return sum;

    }
}
