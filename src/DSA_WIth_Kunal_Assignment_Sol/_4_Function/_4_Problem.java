package DSA_WIth_Kunal_Assignment_Sol._4_Function;

import java.util.Scanner;

public class _4_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        Sum(n1,n2);
        Multiplication(n1,n2);
    }
    public static void Sum(int n1,int n2){
        int total=n1+n2;
        System.out.println("Sum of Two Numbers : " + total);
    }
    public static void Multiplication(int n1,int n2){
        int Mul=n1*n2;
        System.out.println("Multiplication Of Two Number : "+Mul);
    }
}
