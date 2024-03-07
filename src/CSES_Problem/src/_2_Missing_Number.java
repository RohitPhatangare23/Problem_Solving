import java.util.Scanner;

public class _2_Missing_Number {
    public static void main(String[] args) {
        //Missing Number
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] givennumbers=new int[n-1];
        for (int i=0;i<n-1;i++){
            givennumbers[i]=input.nextInt();
        }
        //calculate sum of n numbers
        int total_sum=(n*(n+1))/2;

        //calculate sum of given number;
        int give_sum=0;
        for (int sum:givennumbers){
            give_sum+=sum;
        }

        //calculate the missing number;
        int missing_number=total_sum-give_sum;
        System.out.println(missing_number);
    }
}
