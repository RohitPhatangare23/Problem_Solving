import java.util.Scanner;

public class _4_Bit_String {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        long result=1;
        long mod=1000000007;
        for (int i=0;i<n;i++){
            result=(result*2)%mod;
        }
        System.out.println(result);
    }
}
