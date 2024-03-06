package Question_Basic;

import java.util.Scanner;

public class question_7 {
    // fibonnacci series
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int a=0 ,b=1,c;
        System.out.println("how long yu want fabonnaci series enter that number :");
        int n = input.nextInt();
        System.out.print(a + " " + b);

        for (int i=1;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;

        }
    }


}
