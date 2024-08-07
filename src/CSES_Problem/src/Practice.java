package CSES_Problem.src;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        int successfulWeeks = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//            if (arr[i] >=10) {
//                successfulWeeks++;
//            }
//        }
//        System.out.println(successfulWeeks);


        int t=in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                if (arr[i] >=1000) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
