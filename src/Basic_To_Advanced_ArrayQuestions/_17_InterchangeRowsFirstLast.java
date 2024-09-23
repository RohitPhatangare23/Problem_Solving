package Basic_To_Advanced_ArrayQuestions;

public class _17_InterchangeRowsFirstLast {
    public static void main(StringHackerRank[] args) {
        int mat[][] = { { 2, 3, 4, 5 },
                { 8, 9, 6, 15 },
                { 13, 22, 11, 18 },
                { 19, 1, 2, 0 } };
        System.out.println("Input matrix");
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
        System.out.println();
        }
        System.out.println("Swapped Matrix :");
        swap_First_last(mat);

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void swap_First_last(int[][] mat) {
        int rws=mat.length;

        for (int i=0;i<mat[0].length;i++){
            int temp=mat[0][0];
            mat[0][i]=mat[rws-1][i];
            mat[rws-1][i]=temp;
        }
    }
}
