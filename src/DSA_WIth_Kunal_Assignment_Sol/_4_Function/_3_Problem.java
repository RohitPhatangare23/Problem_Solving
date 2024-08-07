package DSA_WIth_Kunal_Assignment_Sol._4_Function;

import java.util.Scanner;

public class _3_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        VoteAge(n);
    }

    public static void VoteAge(int n) {
        if (n>=18){
            System.out.println("Your Age is "+ n + " Your Eligible For Vote");
        }
        else{
            System.out.println("Your Age is "+ n + " Your Not Eligible For Vote");

        }
    }
}
