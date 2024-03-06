package Question_Basic;

import java.util.Scanner;

public class question_3 {
    // find name in Simple interest
    public static void main(String[] args) {

        float p,s,t,r;

        Scanner value = new Scanner(System.in);


        System.out.println("Enter Principle Value");
        p=value.nextFloat();
        System.out.println("Enter Time");
        t=value.nextFloat();
        System.out.println("Enter Rate");
        r=value.nextFloat();

        s=(p*t*r)/100;
        System.out.println("Simple Interest "+ s);

    }
}
