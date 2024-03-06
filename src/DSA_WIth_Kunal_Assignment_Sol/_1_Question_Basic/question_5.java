package Question_Basic;

import java.util.Scanner;

public class question_5 {
    // print largest number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number");
        int fno=input.nextInt();
        System.out.println("Enter second number");
        int sno=input.nextInt();

        if (fno>sno){
            System.out.println("First number is big");
        }
        else {
            System.out.println("Second number is big");
        }
    }
}
