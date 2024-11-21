package CodeVita;

import java.util.Scanner;

public class _6_Formatting_Software {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of matrices, rows, and columns
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Initialize the 3D array to store matrices
        int[][][] matrices = new int[n][r][c];

        // Read matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    matrices[i][j][k] = sc.nextInt();
                }
            }
        }

        // Process queries
        while (sc.hasNextInt()) {
            int m = sc.nextInt() - 1; // Convert to 0-based index
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrices[m][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(); // Blank line after each matrix output
        }

        sc.close();
    }
}
