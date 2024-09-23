package Basic_To_Advanced_ArrayQuestions;

import java.util.Scanner;

public class _20_sum_of_cubes {
    public static void main(StringHackerRank[] args) {
        Scanner in=new Scanner(System.in);
        int M=in.nextInt();
        int N=in.nextInt();
        System.out.println(SumofCubes(M,N));
        in.close();

    }
    public static int SumofCubes(int m,int n){
        if (m>n){
            return 0;
        }
        int totalsum=0;       // if m=2,n=5 : 8+27+64+125=224
        for (int i=m;i<=n;i++){
            totalsum+=Math.pow(i,3);
        }
        return totalsum;
    }
}
