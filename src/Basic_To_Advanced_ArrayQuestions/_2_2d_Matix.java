package Basic_To_Advanced_ArrayQuestions;

import java.util.Arrays;

public class _2_2d_Matix {
    public static void main(StringHackerRank[] args) {
        int matix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        print2D(matix);
    }
    public static void print2D(int mat[][]){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
        }

        //using for each loop
//        for (int[] row:mat){
//            for (int x:row){
//                System.out.println(x+" ");
//            }
//        }

        System.out.println();
        for (int [] row:mat){
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        System.out.println(Arrays.deepToString(mat));

    }
}
