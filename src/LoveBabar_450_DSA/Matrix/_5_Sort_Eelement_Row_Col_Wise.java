package LoveBabar_450_DSA.Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5_Sort_Eelement_Row_Col_Wise {
    public static void main (String[] args) {
        int N = 4;
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        sortedMatrix(N,mat);
    }
    static void sortedMatrix(int N, int[][] mat)
    {
        List<Integer> temp = new ArrayList<Integer>();

        // Store all elements of matrix into temp
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp.add(mat[i][j]);
            }
        }

        // Sort the temp
        Collections.sort(temp);

        // Print the values of temp
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i)+" ");
        }
    }

}
