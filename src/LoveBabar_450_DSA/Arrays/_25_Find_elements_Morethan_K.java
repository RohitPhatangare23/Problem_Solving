package LoveBabar_450_DSA.Arrays;

import java.util.HashMap;

public class _25_Find_elements_Morethan_K {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
        int n = arr.length;
        int k = 4;
        printElements(arr, n, k);
    }
    public static void printElements(int[] arr, int n, int k) {
        // Calculating n/k
        int x = n / k;

        // Counting frequency of every element using a HashMap
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }

        // Traverse the map and print all the elements with occurrence more than n/k times
        for (int key : mp.keySet()) {
            if (mp.get(key) > x) {
                System.out.println(key);
            }
        }
    }


}
