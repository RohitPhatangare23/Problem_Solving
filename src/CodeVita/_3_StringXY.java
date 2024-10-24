package CodeVita;

import java.util.*;

public class _3_StringXY {

    // Function to calculate minimum String Factor
    public static int minStringFactor(String X, String Y, int S, int R) {
        int n = X.length();
        int m = Y.length();

        // DP array to store minimum substring factor at each point
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Precompute all substrings of Y and reversed Y
        String revY = new StringBuilder(Y).reverse().toString();

        // Traverse each character of X and try to match substrings of Y or reversed Y
        for (int i = 0; i < n; i++) {
            for (int len = 1; len <= m && i + len <= n; len++) {
                String subX = X.substring(i, i + len);

                // Check for substrings in Y
                if (Y.contains(subX)) {
                    dp[i + len] = Math.min(dp[i + len], dp[i] + S);
                }

                // Check for substrings in reversed Y
                if (revY.contains(subX)) {
                    dp[i + len] = Math.min(dp[i + len], dp[i] + R);
                }
            }
        }

        // If dp[n] is still infinite, it's impossible to form X from Y
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings X and Y
        String X = sc.nextLine();
        String Y = sc.nextLine();

        // Input integers S and R
        int S = sc.nextInt();
        int R = sc.nextInt();

        // Get result
        int result = minStringFactor(X, Y, S, R);

        // Output result
        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}

