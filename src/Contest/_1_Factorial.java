package Contest;

public class _1_Factorial {
    public static void main(String[] args) {
        int n=8;
        long result=fact(n);
        System.out.println(result);
    }

    private static long fact(int n) {
        if (n==0 || n==1){
            return 1;
        }
        long result=1;
        for (int i=2;i<=n;i++){
            result=result*i;
        }
        return result;
    }
}
