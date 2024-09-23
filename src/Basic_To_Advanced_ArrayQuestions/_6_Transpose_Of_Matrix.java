package Basic_To_Advanced_ArrayQuestions;

public class _6_Transpose_Of_Matrix {

    //reactangular matrix :
    static final int R1=3;
    static final int C1=4;

    //square matrix,
    static final int  N=4;


    public static void main(StringHackerRank[] args) {
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        int B[][]=new int[N][N];
        //Squaretranspose(A,B);
        //Reactangletranspose(A,B);
        Squaretranspose2(A,B);
        System.out.println();
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.print("\n");
        }



        //ReactangleMAtrix
//        for (int i=0;i<R1;i++){
//            for (int j=0;j<C1;j++){
//                System.out.print(B[i][j]+" ");
//            }
//            System.out.print("\n");
//        }
    }

    private static void Squaretranspose2(int[][] A, int[][] B) {
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                int temp=A[i][j];
                A[i][j]=B[j][i];
                B[j][i]=temp;
            }
        }
    }

    private static void Reactangletranspose(int[][] a, int[][] b) {
        for (int i=0;i<R1;i++){
            for (int j=0;j<C1;j++){
                b[i][j]=a[j][i];
            }
        }
    }

    private static void Squaretranspose(int[][] a, int[][] b) {

        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                b[i][j]=a[j][i];
            }
        }
    }
}
