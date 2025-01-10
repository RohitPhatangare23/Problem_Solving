package Blind75;

import java.util.Arrays;

public class _9_String_compression {
    public static void main(String[] args) {
        // Test case 1
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length = compression(chars);

        System.out.println("Compressed length: " + length);
        System.out.print("Compressed array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        // Test case 2
        char[] chars2 = {'a', 'a', 'a', 'b', 'b', 'c'};
        length = compression(chars2);

        System.out.println("Compressed length: " + length);
        System.out.print("Compressed array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars2[i]);
        }
        System.out.println();

    }
    public  static int compression(char[] chars){
        StringBuilder sb=new StringBuilder();

        int i=1;
        int count=1;
        sb.append(chars[0]);
        while (i<chars.length){
            if (chars[i]==chars[i-1])
            {
                count++;
            }
            else {
                if (count>1){
                    sb.append(count);
                }
                sb.append(chars[i]);
                count=1;
            }
            i++;
        }
        if (count>1){
            sb.append(count);
        }
        for (int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }


        return sb.length();
    }
}
