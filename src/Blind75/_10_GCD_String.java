package Blind75;

public class _10_GCD_String {
    public static void main(String[] args) {
         String str1="ABCABC";
         String str2="ABC";
        System.out.println(gcdOfString(str1,str2));
    }
    public static String gcdOfString(String str1,String str2){
        if (str1.equals(str2)){
            return str1;
        }
        if (str1.length()<str2.length()){
            return gcdOfString(str2,str1);
        }
        if (str1.startsWith(str2)) {
            return gcdOfString(str1.substring(str2.length()),str2);
        }
        return "";
    }


}
