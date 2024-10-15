package Contest;

import java.util.Scanner;

public class Profit{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test=input.nextInt();
        while (test-->0){
            int day=input.nextInt();
            long Profit=(long)(day-1)*day/2;
            System.out.println(Profit);
        }
    }
}