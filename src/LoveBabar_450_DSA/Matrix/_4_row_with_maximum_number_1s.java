package LoveBabar_450_DSA.Matrix;

public class _4_row_with_maximum_number_1s {
    static final int R = 4;
    static final int C = 4;

    // The main function that returns index of row with
    // maximum number of 1s
    // Driver Code
    public static void main(String[] args)
    {
        int[][] mat = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };

        System.out.println(
                "Index of row with maximum 1s is "
                        + rowWithMax1s(mat));
    }
    public static int rowWithMax1s(int[][] mat)
    {
        int maxRow = -1, row = 0, col = C - 1;

        // Move till we are inside the matrix
        while (row < R && col >= 0) {
            // If the current value is 0, move down to the
            // next row
            if (mat[row][col] == 0) {
                row++;
            }
            // Else if the current value is 1, update maxRow
            // and move to the left column
            else {
                maxRow = row;
                col--;
            }
        }
        return maxRow;
    }
}
