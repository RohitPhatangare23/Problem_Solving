package Basic_To_Advanced_ArrayQuestions;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StringHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        int n = A.compareTo(B);
        if (n > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String output = A.substring(0, 1).toUpperCase() + A.substring(1);
        String output2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output + " " + output2);

        //Q1)how to get first letter in capital and others keeps small case.
        String firstname="rohit";
        String lastname="phatnagare";
        String outputfn=firstname.substring(0,1).toUpperCase()+firstname.substring(1);
        String outputln=lastname.substring(0,1).toUpperCase()+lastname.substring(1);
        System.out.println(outputfn+" "+outputln);

        Date d1=new Date();
        System.out.println(d1);

        Calendar c = Calendar.getInstance();

        // Print corresponding instances by passing
        // required some as in arguments
        System.out.println("Day of week : "
                + c.get(Calendar.DAY_OF_WEEK));

        System.out.println("Day of year : "
                + c.get(Calendar.DAY_OF_YEAR));

        System.out.println("Week in Month : "
                + c.get(Calendar.WEEK_OF_MONTH));

        System.out.println("Week in Year : "
                + c.get(Calendar.WEEK_OF_YEAR));

        System.out.println(
                "Day of Week in Month : "
                        + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        Scanner scc=new Scanner(System.in);
        String Aa=scc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev="";
        for(int i=0;i<Aa.length();i++)
        {
            char ch=A.charAt(i);
            rev=ch+rev;
        }
        if(Aa.equals(rev))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }


}
