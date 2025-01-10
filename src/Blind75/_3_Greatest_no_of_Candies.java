package Blind75;

import java.util.ArrayList;
import java.util.List;

public class _3_Greatest_no_of_Candies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extracandies=3;
        List<Boolean> result =kidsWithCandies(candies,extracandies);
        System.out.println(result);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int max=candies[0];
        for (int i=1;i<candies.length;i++){
            if (candies[i]>=max){
                max=candies[i];
            }
        }
        for (int val:candies){
            ans.add(val + extraCandies >= max);
        }
        return ans;
    }

}
