package Question_Basic;

import java.util.Scanner;

public class question_9 {
    // ArmstrongNumber
    public static void main(String[] args) {

        // 1 part= find length of number
        Scanner input =new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n=input.nextInt();
        int temp=n;
        int length=0;
        while (temp !=0){
            length=length+1;
            temp=temp/10;
        }
        System.out.println("length of number is :"+length);

        //2 part == reverse number;

        int temp2=n;
        int rem;

        int arm=0;

        while (temp2 != 0){
            rem =temp2 % 10;
            int mul=1;
            for (int i=1;i<=length;i++){
                mul=mul*rem;

            }
            arm=arm+mul;
            temp2=temp2/10;
        }
        if (n==arm) {
            System.out.println(n+" is armstrong number");
        }
        else {
            System.out.println(n+" is not armstrong number");
        }


    }

}
