package Contest;

import java.util.Scanner;

public class MagicalCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Cost of the item

            // Check if the number is payable using the denominations
            if (isPayable(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // Function to check if n can be paid using 1, 11, 111, etc.
    public static boolean isPayable(int n) {
        // We try to reduce the value of n by subtracting multiples of 11
        for (int i = 0; i * 111 <= n; i++) {
            if ((n - i * 111) % 11 == 0) {
                return true;  // Found a solution
            }
        }
        return false;  // If no combination works
    }
}
