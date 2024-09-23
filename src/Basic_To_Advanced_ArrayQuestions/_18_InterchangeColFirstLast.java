package Basic_To_Advanced_ArrayQuestions;

public class _18_InterchangeColFirstLast {
    static int  N=3;
    public static void main(StringHackerRank[] args) {
        int mat[][]
                = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Swapped Matrix :");
        swap_First_lastc(mat);

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void swap_First_lastc(int[][] mat) {
        int cls=N;
        for (int j = 0; j < N; j++) {
            int temp = mat[j][0];
            mat[j][0] = mat[j][N - 1];
            mat[j][N - 1] = temp;
        }
    }
}
