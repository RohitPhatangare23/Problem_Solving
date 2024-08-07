package DSA_WIth_Kunal_Assignment_Sol._4_Function;

import java.util.Scanner;

public class _2_Problem {
    public static void main(String[] args) {
//        Define a program to find out whether a given number is even or odd.

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        evenOdd(n);
    }

    private static void evenOdd(int n) {
        if (n%2==0){
            System.out.println(n+" is even number");
        }
        else{
            System.out.println(n+" is odd number");
        }
    }
}
