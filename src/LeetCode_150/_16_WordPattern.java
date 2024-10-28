package LeetCode_150;


import java.util.HashMap;

public class _16_WordPattern{
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {

        String[] arr=s.split(" ");
        if (pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> hm=new HashMap<>();
        for (int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            boolean containskey=hm.containsKey(ch);
            if (hm.containsValue(arr[i]) && !containskey){
                return false;
            }
            if (containskey && !hm.get(ch).equals(arr[i])){
                return false;
            }
            else{
                hm.put(ch,arr[i]);
            }
        }
        return true;
    }
}
