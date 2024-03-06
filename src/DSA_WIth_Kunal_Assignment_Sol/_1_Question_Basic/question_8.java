package Question_Basic;

import java.util.Scanner;

public class question_8 {
    // Palindrome number;
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter NUmber");
        int n= input.nextInt();
        int temp=n;
        int rem,rev=0;
        while (temp !=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;


        }
        if (n==rev){
            System.out.println(n +" is palindrome");
        }
        else{
            System.out.println(n + " is not paindrome");
        }
    }


}
