package LoveBabar_450_DSA.Strings;

import java.sql.Struct;

public class _1_Methods {
    public static void main(String[] args) {
        String str1 = "Rohit";
        String str2 = "Phatangare"; //first a=2,other = 4, and 7

        System.out.println("String length : " + str1.length());

        System.out.println("at index 3 :" + str1.charAt(3));

        System.out.println(str1.substring(1));
        System.out.println(str1.substring(1, 4));
        System.out.println(str1.subSequence(1, 4));

        System.out.println(str1.concat(" " + str2));

        System.out.println("-------------------------------");

        System.out.println(str2.indexOf("a"));
        System.out.println(str2.indexOf("a", 3));

        System.out.println(str2.lastIndexOf("a"));

        System.out.println("-------------------------------");

        Boolean b = str1.equals("Rohit");
        System.out.println(b);

        Boolean b1 = str1.equals(str2);
        System.out.println(b1);

        Boolean b2 = str1.equals("rohit");
        System.out.println(b2);

        Boolean b3 = str1.equalsIgnoreCase("roHIt");
        System.out.println(b3);


        /*
        if string1 > string2, it returns positive number
        if string1 < string2, it returns negative number
        if string1 == string2, it returns 0
        *
        * */
        System.out.println("-------------------------------");
        int out = str1.compareTo(str2);
        System.out.println(out);

        String str3="Rohit";
        int out1 = str1.compareTo(str3);
        System.out.println(out1);

        String str4="roHIt";
        int out2=str1.compareToIgnoreCase(str4);
        System.out.println(out2);

        System.out.println("-------------------------------");

        System.out.println("Lowercase = "+str4.toLowerCase());
        System.out.println("Uppercase = "+str4.toUpperCase());

        String str5="   Mrunal Phatangare       ";
        System.out.println("Without Trim = "+str5);
        System.out.println("With Trim = "+str5.trim());

        System.out.print("Replace : ");
        System.out.println(str5.replace( "Mrunal","Vidya"));

        System.out.println("h contains str1 : " + str1.contains("h"));

        System.out.println("-------------------------------");

        char[] ch=str1.toCharArray();
        System.out.println(ch);

        System.out.println(str1.startsWith("R"));








    }
}
