package Blind75;

import java.util.Stack;

public class _6_reverse_words_string {
    public static void main(String[] args) {
        String str="the sky is blue";
        System.out.println(reverse1(str));
    }

    private static String reverse1(String s) {

        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static String reverse2(String s){
        s = s.trim();

        Stack<String> st = new Stack<>();
        int j = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                st.push(s.substring(j, i).trim());
                j = i + 1;
            }
        }
        st.push(s.substring(j));

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop()).append(" ");
        }

        return sb.toString().trim();
    }
}
