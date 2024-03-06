package Question_Basic;

import java.util.Scanner;

public class question_6 {
    // convert rupees in USD
    public static void main(String[] args) {
        double USD;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Rupees : ");
        double rupees=input.nextDouble();

        USD=rupees * 0.013;
        System.out.println("United states dollor : "+ USD);
    }
}
