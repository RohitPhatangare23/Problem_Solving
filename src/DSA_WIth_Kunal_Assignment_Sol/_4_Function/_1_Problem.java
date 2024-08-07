package DSA_WIth_Kunal_Assignment_Sol._4_Function;

import java.util.Scanner;

public class _1_Problem {
    public static void main(String[] args) {
//        Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("Maximum Value : " +maximum(a,b,c));
        System.out.println("Minimum Value : " +minimum(a,b,c));

    }

    public static int minimum(int first,int second,int third) {
        int min=first;
        if (second<min){
            min = second;
        }
        if (third<min){
            min=third;
        }
        return min;

    }

    public static int maximum(int first,int second,int third) {
        int max=first;
        if (second>max){
            max = second;
        }
        if(third>max){
            max=third;
        }
        return max;

    }
}
