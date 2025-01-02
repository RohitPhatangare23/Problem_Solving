package Blind75;

import java.util.HashSet;
import java.util.Set;

public class _2_Count_Vowel {
    public static void main(String[] args) {
        _2_Count_Vowel solution=new _2_Count_Vowel();
        String[] str={"aba","bcb","ece","aa","e"};
        int[][] queries={{0,2},{1,4},{1,1}};
        int[] result=solution.vowelString(str,queries);
        for (int res:result){
            System.out.println(res+" ");
        }
    }

    private int[] vowelString(String[] str, int[][] queries) {
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int n=str.length;
        int[] prefixSum=new int[n+1];
        for (int i=0;i<n;i++){
            if (isVowelString(str[i],vowels)){
                prefixSum[i+1]=prefixSum[i]+1;
            }
            else {
                prefixSum[i+1]=prefixSum[i];
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixSum[ri + 1] - prefixSum[li];
        }
        return result;
    }

    private boolean isVowelString(String s, Set<Character> vowels) {
        if (s==null || s.length()==0)
            return false;
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
        return vowels.contains(first) && vowels.contains(last);
    }


}
