package Blind75;

public class _15_Max_Sum_Avg {
    public static void main(String[] args) {
        int[] n={1,12,-5,-6,50,3};
        int k=4;
        double result=maxSumAvg(n,k);
        System.out.println(result);
    }
    public  static double maxSumAvg(int[] num,int k){
        double avg=0.0;
        double ans=0.0;

        int sum=0;
        for (int i=0;i<k;i++){
            sum=sum+num[i];
        }
        avg=sum*1.0/k;
        ans =avg;
        for (int i=k;i<num.length;i++){
            sum=sum+num[i]-num[i-k];
            avg=sum*1.0/k;
            ans=Math.max(ans,avg);
        }
        return ans;
    }
}
