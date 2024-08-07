package LoveBabar_450_DSA.Arrays;

import java.util.HashSet;

public class _6_Union_And_Intersection {
    public static void main(String[] args) {
        int a[] = { 7, 1, 5, 2, 3, 6 };
        int b[] = { 3, 8, 6, 20, 7 };
        int n=a.length;
        int m=b.length;
        getUnion(a, n, b, m);
        getIntersection(a,n,b,m);
    }
    static void getUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++){
            hs.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            hs.add(b[i]);
        }
        System.out.println(hs);
    }
    public static void getIntersection(int[] a, int n, int[] b, int m) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            if (hs.contains(b[i]))
                System.out.print(b[i] + " ");
        }
    }

}
