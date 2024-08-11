package LoveBabar_450_DSA.Arrays;

import java.math.BigInteger;

public class _22_Factorial_BigInt {
    public static void main(String args[]) throws Exception
    {
        int N = 20;
        System.out.println(factorial(N));
    }
    static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }



}
