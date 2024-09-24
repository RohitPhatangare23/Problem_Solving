package Accenture;

import java.util.Scanner;

public class _6_Problem {
    public static void main(String[] args) {

        /*
        * Q ) Calculate HCF OF 2 Integer
        * */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int number1=input.nextInt();
        System.out.println("Enter Second Number : ");
        int number2=input.nextInt();

        int hcf=calculateHCF(Math.abs(number1) ,Math.abs(number2));
        System.out.println("HCF Of "+ number1+" and "+number2+" is :"+hcf);
    }

    private static int calculateHCF(int a,int b) {
    while (b!=0){
        int temp=b;
        b=a%b;

        a=temp;

    }
    return a;
    }
}
