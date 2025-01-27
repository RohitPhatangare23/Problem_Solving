package Blind75;

import java.util.HashMap;
import java.util.HashSet;

public class _22_unique_no_occurrences {
    public static void main(String[] args) {
        int[] nums={1,2,2,1,1,3};
        boolean result=uniqueOccurrences(nums);
        System.out.println(result);
    }
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> fmap=new HashMap<>();
        for (int val:arr){
            if (fmap.containsKey(val)){
                fmap.put(val,fmap.get(val)+1);
            }
            else {
                fmap.put(val,1);
            }
        }
        HashSet<Integer> unique=new HashSet<>();
        for (int freq:fmap.values()){
            if (unique.contains(freq)){
                return false;
            }
            else {
                unique.add(freq);
            }
        }
        return true;
    }
}
