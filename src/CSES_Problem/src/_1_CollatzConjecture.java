import java.util.Scanner;

public class _1_CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Collatz sequence for " + n + ":");

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                // If n is even, divide it by 2
                n /= 2;
            } else {
                // If n is odd, multiply it by 3 and add 1
                n = 3 * n + 1;
            }
        }

        // Print the final 1 in the sequence
        System.out.print(n);

        scanner.close();
    }
}
