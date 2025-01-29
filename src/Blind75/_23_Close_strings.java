package Blind75;

import java.util.Arrays;

public class _23_Close_strings {
    public static void main(String[] args) {

        /*
        Operation=swap
        trasform=a->b ;  b->a

        1)Length should be same
        1)charachter should be same
        1)frequency should be same
         */
        String str1="abc";
        String str2="bca";
        boolean result=closeString(str1,str2);
        System.out.println(result);

    }

    private static boolean closeString(String str1, String str2) {

        if (str1.length() != str2.length()){
            return false;
        }
        int[] ca1=new int[26];
        int[] ca2=new int[26];

        for (int i=0;i<str1.length();i++){
            ca1[str1.charAt(i)-'a']++;
            ca2[str2.charAt(i)-'a']++;
        }
        for (int i=0;i<26;i++){
            if (ca1[i]>0 && !(ca2[i]>0)){
                return false;
            }
        }
        Arrays.sort(ca1);
        Arrays.sort(ca2);
        return Arrays.equals(ca1,ca2);
    }
}
