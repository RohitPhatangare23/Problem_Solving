package LeetCode_150;

import java.util.ArrayList;

public class _11_Words_Contaning_Char {
    public static void main(String[] args) {
        String[] s={"leet","code"};
        char x='e';
        System.out.println(findWordsContaining(s,x));
    }
    public static ArrayList<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<words.length;i++){
            if (words[i].contains(String.valueOf(x))){
                result.add(i);
            }

        }
        return  result;
    }
}
