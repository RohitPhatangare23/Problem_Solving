package DSA_WIth_Kunal_Assignment_Sol._4_Function;

import java.util.Scanner;

public class _5_Problem {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int r=in.nextInt();
        AreaOfCircle(Math.PI,r);
        CircumferenceOfCircle(Math.PI,r);
    }

    public static void AreaOfCircle(double pi, int r) {
        double aoc=pi *r*r;
        System.out.println("Area of Circle is : " + aoc);
    }

    public static void CircumferenceOfCircle(double pi,int r){
        double coc = 2 *pi*r;
        System.out.println("Circumference Of Circle is :" + coc);
    }
}
