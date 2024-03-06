package Question_Basic;

import java.util.Scanner;

public class question_1 {
    // find even no. or odd no.
    public static void main(String[] args) {
        int value;
        System.out.println("Enter Number ");
        Scanner num = new Scanner(System.in);
        value = num.nextInt();
//        System.out.println(value);
        if (value % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");
        }
    }
}
