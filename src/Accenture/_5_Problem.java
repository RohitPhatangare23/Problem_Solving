package Accenture;

import java.util.Scanner;

public class _5_Problem {
    public static void main(String[] args) {
        /*
        Write A Function that takes a string as input ,counts the number of lowercase and uppercase letter and convert the entire string
        into the case with the grater count . if the counts are equal , leave the string
        * case1 :
        RoHIT
        ROHIT

        case2 :
        rohIT
        rohit
        * */

        Scanner in=new Scanner(System.in);
        System.out.println("Enter The String :");
        String str=in.next();
        System.out.println(Convert(str));
    }

    private static String Convert(String input_String) {
        int lower=0;
        int upper=0;
        for (char ch:input_String.toCharArray()){
            if (Character.isLowerCase(ch)){
                lower++;
            }
            else if(Character.isUpperCase(ch)){
                upper++;
            }

        }
        if (lower>upper){
            return input_String.toLowerCase();
        }
        else if(lower<upper){
            return input_String.toUpperCase();
        }
        else{
            return input_String;
        }
    }
}
