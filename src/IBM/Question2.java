package IBM;

public class Question2 {

    // Helper function to calculate combinations C(n, r)
    public static int combination(int n, int r) {
        if (n < r) return 0; // Not enough elements to choose from
        if (r == 0 || r == n) return 1; // Base cases
        int result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }

    public static int diverseDeputation(int m, int w) {
        // If there are no men or no women, no diverse deputation is possible
        if (m == 0 || w == 0) return 0;

        // Case 1: 2 men, 1 woman
        int case1 = combination(m, 2) * combination(w, 1);

        // Case 2: 2 women, 1 man
        int case2 = combination(w, 2) * combination(m, 1);

        // Total distinct combinations
        return case1 + case2;
    }

    public static void main(String[] args) {
        // Sample Case 0
        System.out.println(diverseDeputation(3, 0)); // Output: 0

        // Sample Case 1
        System.out.println(diverseDeputation(2, 2)); // Output: 4
    }
}
