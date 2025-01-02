package Blind75;

public class _1_Max_Score_After_Split_String {
    public static void main(String[] args) {
       String s="011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s){
        int n=s.length();
        int maxScore=0;
        int leftzero=0;
        int rightone=0;
        for (char c:s.toCharArray()){
            if (c=='1'){
                rightone++;
            }
        }
        for (int i=0;i<n-1;i++){
            if (s.charAt(i)=='0'){
                leftzero++;
            }
            else {
                rightone--;
            }
            int currentscore=leftzero+rightone;
            maxScore=Math.max(maxScore,currentscore);
        }
        return maxScore;
    }


}
