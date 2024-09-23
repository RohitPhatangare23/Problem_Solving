package Basic_To_Advanced_ArrayQuestions;

import java.util.Scanner;

public class _27_Vowels_Count {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String str=in.next();
        String trimString=str.trim();
        int Vcount=0;
        int Ccount=0;

        for (int i = 0; i < trimString.length(); i++) {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                Vcount++;
            }
            else if(trimString.charAt(i)!='a'&&trimString.charAt(i)!='i'&&trimString.charAt(i)!='u'&&trimString.charAt(i)!='e'&&trimString.charAt(i)!='o'&&trimString.charAt(i)!=' '){
                Ccount++;
            }
        }
        if(Vcount>Ccount)
            System.out.print("Yes");
        else if(Ccount>Vcount)
            System.out.print("No");
        else {
            System.out.print("Same");
        }




    }
}
