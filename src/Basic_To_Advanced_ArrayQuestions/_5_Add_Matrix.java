package Basic_To_Advanced_ArrayQuestions;

public class _5_Add_Matrix {
    public static void main(StringHackerRank[] args) {

        int size = 4;

        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        // Print the matrices A
        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);

        int B[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        // Print the matrices B
        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);

        // Add the two matrices
        int C[][] = add(A, B, size);

        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);
    }

    private static void printMatrix(int[][] m, int rowsize, int colsize) {
        for (int i=0;i<rowsize;i++){
            for (int j=0;j<colsize;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }


    static int[][] add(int A[][], int B[][],
                       int size)
    {
        int i, j;
        int C[][] = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }
}
