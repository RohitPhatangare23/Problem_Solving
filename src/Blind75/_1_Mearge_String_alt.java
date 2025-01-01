package Blind75;

public class _1_Mearge_String_alt {
    public static void main(String[] args) {
        String s1="abc";
        String s2="xyz";
        String result=meargeAlternatively(s1,s2);
        System.out.println(result);
    }

    public static String meargeAlternatively(String word1,String word2){
        StringBuilder sb=new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        while (i < n1 || i < n2) {
            if (i<n1){
                sb.append(word1.charAt(i));
            }
            if (i<n2){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
