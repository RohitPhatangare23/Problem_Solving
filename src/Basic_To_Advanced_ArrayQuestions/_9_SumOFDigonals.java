package Basic_To_Advanced_ArrayQuestions;

public class _9_SumOFDigonals {
    public static void main(StringHackerRank[] args) {
        int[][] matrix = { { 8, 2, 13, 4 },
                { 9, 16, 17, 8 },
                { 1, 22, 3, 14 },
                { 15, 6, 17, 8 } };
        sumOfDigonals(matrix,4);
    }

    private static void sumOfDigonals(int[][] matrix, int N) {
        int pd=0,sd=0;
        for (int i=0;i<N;i++){
            pd=pd+matrix[i][i];
            sd=sd+matrix[i][N-(i+1)];
        }
        System.out.println("sum of principal digonal = "+ pd);
        System.out.println("sum of secondary digonal = "+ sd);
    }
}
