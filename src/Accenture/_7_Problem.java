package Accenture;

import java.util.Scanner;

public class _7_Problem {
    public static void main(String[] args) {
        /*
        * Q)Find Prime Number Between Two range
        * */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Starting Number Of Range : ");
        int start=input.nextInt();
        System.out.println("Enter Ending Number Of Range : ");
        int end=input.nextInt();

        //Validate Inputs:
        if (start<0 || end<0 || start>end){
            System.out.println("Invalid Input, please enter valid range value !");
        }
        else{
            printPrimeInRange(start,end);
        }
        input.close();

    }

    private static void printPrimeInRange(int start, int end) {
        System.out.println("Prime Number Between " + start+" And"+end);
        for(int i=start;i<=end;i++){
            if (isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){

            return false;
            }
        }
        return true;
    }

}
