package DSA_WIth_Kunal_Assignment_Sol._4_Function;

import java.util.Scanner;

public class _6_Problem {
    public static void main(String[] args) {
        //Brute Force.
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        if (Prime(11)){
            System.out.println("11 IS  Prime ");
        }
        else{
            System.out.println("11 is NOT Prime");
        }
        if (Prime(20)){
            System.out.println("20 IS  Prime ");
        }
        else {
            System.out.println("20 is NOT PRime");
        }


    }

    public static boolean Prime(int n) {
        if (n <= 1) {
            return false;

        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
