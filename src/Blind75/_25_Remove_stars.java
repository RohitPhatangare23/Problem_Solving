package Blind75;

public class _25_Remove_stars {
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.println(removestars(s));
    }
    public static String removestars(String str){
        char[] ch=new char[str.length()];
        int i=0;
        for(int j=0;j< str.length();j++){
            char c= str.charAt(j);
            if (c == '*') {
                i--;
            }
            else{
                ch[i]=c;
                i++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int j=0;j<i;j++){
            sb.append(ch[j]);
        }
        return sb.toString();
    }
}
