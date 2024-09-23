package Basic_To_Advanced_ArrayQuestions;

public class _11_Print_Corner_Element {
    public static void main(StringHackerRank[] args) {
        int mat[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printCornerValues(mat);
    }

    private static void printCornerValues(int[][] mat) {
        System.out.println("Input Matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Corner Value");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (i == 0 || j == 0 || i == mat.length - 1 || j == mat[i].length - 1) {
                    System.out.print(mat[i][j]+" ");
                } else {
                    // Printing Space if element
                    // is not at Boundary
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
