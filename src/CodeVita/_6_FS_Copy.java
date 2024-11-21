package CodeVita;
import java.util.*;

public class _6_FS_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of matrices
        int N = sc.nextInt();

        // Dimensions of each matrix
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Array to store all matrices
        int[][][] matrices = new int[N][r][c];

        // Reading matrices row by row
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < N * c; col++) {
                int matrixIndex = col / c; // Determine which matrix this element belongs to
                int columnIndex = col % c; // Determine column within the matrix
                matrices[matrixIndex][row][columnIndex] = sc.nextInt();
            }
        }

        // Reading instructions
        sc.nextLine(); // Consume the remaining newline
        List<List<Integer>> instructions = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break; // Stop if no more instructions
            List<Integer> instruction = new ArrayList<>();
            for (String value : line.split(" ")) {
                instruction.add(Integer.parseInt(value));
            }
            instructions.add(instruction);
        }

        // Execute instructions and format output
        for (List<Integer> instruction : instructions) {
            for (int matrixIndex : instruction) {
                int[][] matrix = matrices[matrixIndex - 1]; // Convert 1-based to 0-based index
                for (int[] row : matrix) {
                    for (int val : row) {
                        System.out.print(val + " ");
                    }
                }
            }
            System.out.println(); // End line after each instruction
        }
    }
}
