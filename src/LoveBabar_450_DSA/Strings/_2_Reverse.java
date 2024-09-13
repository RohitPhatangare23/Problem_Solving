package LoveBabar_450_DSA.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class _2_Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String str = in.nextLine();
        char[] c1 =str.toCharArray();
        System.out.println("Orginal String");
        System.out.println(c1);

        reverseStr(c1);

        System.out.println("Reversed Array : "+Arrays.toString(c1));
    }

    private static void reverseStr(char[] c1) {
        int left=0;
        int right=c1.length-1;
        while (left<right){
            char temp=c1[left];
            c1[left]=c1[right];
            c1[right]=temp;

            left++;
            right--;
        }
    }
    /*
    Time Complexity: O(n)
    Auxiliary Space: O(1)
     */


    /*
    public static String reverseStringLoop(String inputStr) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversedStr.append(inputStr.charAt(i));
        }
        return reversedStr.toString();
    }


    Time Complexity: O(n)
    Auxiliary Space: O(n) for storing the reversed string
     */



}
