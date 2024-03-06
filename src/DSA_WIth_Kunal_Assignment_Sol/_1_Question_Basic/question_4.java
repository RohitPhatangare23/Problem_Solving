package Question_Basic;

import java.util.Scanner;

public class question_4 {
    // find + / % * -
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number :");
        float fno=input.nextFloat();
        System.out.print("Enter Second Number :");
        float sno=input.nextFloat();

//        System.out.println("first no == " +fno);
//        System.out.println("second  no == " +sno);

        System.out.println("Enter the Operator (+, -, *, /,%): ");
        char ch = input.next().charAt(0);

        if (ch=='+'){
            float add=fno+sno;
            System.out.print("Addition :"+ add);
        }
        if (ch=='-'){
            float sub=fno-sno;
            System.out.print("minus :"+ sub);
        }
        if (ch=='*'){
            float mul=fno*sno;
            System.out.print("multiplication :"+ mul);
        }
        if (ch=='/'){
            float div=fno/sno;
            System.out.print("Division :"+ div);
        }
        if (ch=='%'){
            float mod=fno%sno;
            System.out.print("Modulus :"+ mod);
        }



    }
}
