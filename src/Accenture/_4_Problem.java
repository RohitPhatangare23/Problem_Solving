package Accenture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4_Problem {
    static int cut(int n){
        int m=1000000007;
        int num=(n*(n+1)/2)+1;
        return num%m;
    }
    public static void main(String[] args) {
        /*
        Q) if cake is 3 layes and user cut the cake equal parts verticaly input (no. of times)
        verticaly 2 cut karga to 4 and horizontali 4 divide in peace of cake
        */
        Scanner input=new Scanner(System.in);
        System.out.println(cut(5)); //16
        System.out.println(cut(1)); //2

        // collections framework



    }
}
