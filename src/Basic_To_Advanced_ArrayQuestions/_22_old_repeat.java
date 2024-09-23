package Basic_To_Advanced_ArrayQuestions;

import java.util.Scanner;

public class _22_old_repeat {
    public static void main(StringHackerRank[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();//array
            int k=in.nextInt();//repeat
            int s=in.nextInt(); //sum
            int ss=0,c=0,i=1;
            while (c!=n){
                ss+=i;
                c++;
                i+=2;

            }
            System.out.println((s-ss)/(k-1));
        }
    }
}
