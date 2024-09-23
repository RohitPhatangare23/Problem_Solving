package Basic_To_Advanced_ArrayQuestions;

public class _7_Normal_Trace {
    static final int max=50;
    public static void main(StringHackerRank[] args) {
        int matrix[][] = {
                { 2, 3, 5, 6, 7 },      { 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17 }, { 18, 1, 3, 0, 6 },
                { 7, 8, 11, 8, 11 },
        };
        System.out.println("Trace of matrix"+ Trace(matrix,5));
        System.out.println("Normal of matrix"+ Normal(matrix,5));
    }

    private static int Normal(int[][] matrix, int N) {
        int s=0;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                s=s+matrix[i][j]*matrix[i][j];
            }
        }
            return (int) Math.sqrt(s);
    }

    private static int  Trace(int[][] matrix, int N) {
        int s=0;
        for (int i=0;i<N;i++){
            s=s+matrix[i][i];
        }
        return s;
    }
}
