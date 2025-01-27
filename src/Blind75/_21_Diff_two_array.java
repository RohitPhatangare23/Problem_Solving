package Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _21_Diff_two_array {
    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={2,4,6};
        List<List<Integer>> result = findDifference(num1, num2);

        // Print the result
        System.out.println("Elements in nums1 but not in nums2: " + result.get(0));
        System.out.println("Elements in nums2 but not in nums1: " + result.get(1));

    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for (int val:nums1){
            set1.add(val);
        }
        for (int val:nums2){
            set2.add(val);
        }

        HashSet<Integer> ans1=new HashSet<>();
        for (int val:nums1){
            if (set2.contains(val)==false){
                ans1.add(val);
            }
        }

        HashSet<Integer> ans2=new HashSet<>();
        for (int val:nums2){
            if (set1.contains(val)==false){
                ans2.add(val);
            }
        }
        return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));
    }
}
