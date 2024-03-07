import java.util.Arrays;
import java.util.Scanner;

public class _3_Increasing_Array {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        long moves=0;
        for (int i=1;i<n;i++){
            if (array[i]<array[i-1]){
                long diff=array[i-1]-array[i];
                array[i]=array[i-1];
                moves+=diff;
            }
        }
        System.out.println(moves);
        System.out.println(Arrays.toString(array));
    }
}
