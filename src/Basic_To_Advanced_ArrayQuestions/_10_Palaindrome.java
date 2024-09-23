package Basic_To_Advanced_ArrayQuestions;

import java.util.Scanner;

public class _10_Palaindrome {
    public static void main(StringHackerRank[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        //Method 1
        int reverseNo=reverseNumber(n);
        //System.out.println("Reverse Of Number :" +reverseNo);

        //Method 2
        int rev=recursive(n,0);
        System.out.println("Reverse Of Number :" +rev);


        if (n==reverseNo){
            System.out.println("This is Palindrome Number");
        }
        else {
            System.out.println("This is Not a Palindrome Number");
        }
    }

    private static int recursive(int n, int rev) {
        if (n<10){
            return rev*10+n;
        }
        else{
            int last_digit=n%10;
            rev=rev*10+last_digit;
            return recursive(n/10,rev);
        }
    }

    private static int reverseNumber(int n) {
        int reversedN=0;
        while (n>0){
            reversedN=reversedN*10+n%10;
            n=n/10;
        }
        return reversedN;
    }
}
