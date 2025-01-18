package Blind75;

public class _16_max_Number_of_Vowel {
    public static void main(String[] args) {
        String str="leetcode";
        int k=3;
        System.out.println(maxVowel(str,k));
    }
    public static  int maxVowel(String str,int k){
        int count =0;
        int ans=0;
        for (int i=0;i<k;i++){
            char ch= str.charAt(i);
            if (isVowel(ch)){
                count++;
            }
        }
        ans=count;
        for (int i=k;i<str.length();i++){
            char chi=str.charAt(i);
            char chimk=str.charAt(i-k);
            if (isVowel(chi)){
                count++;
            }
            if (isVowel(chimk)){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;

    }
    public static boolean isVowel(char ch){
        if (ch=='a'){
            return true;
        }
        else if (ch=='e'){
            return true;
        }
        else if (ch=='i'){
            return true;
        }
        else if (ch=='o'){
            return true;
        }
        else if (ch=='u'){
            return true;
        }
        else {
            return false;
        }
    }
}
