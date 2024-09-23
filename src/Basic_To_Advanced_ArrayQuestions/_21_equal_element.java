package Basic_To_Advanced_ArrayQuestions;

import java.util.Scanner;

public class _21_equal_element {
        public static void main(StringHackerRank[] args) {
                Scanner in =new Scanner(System.in);
                int t=in.nextInt();
                while (t-->0){
                        int n=in.nextInt();
                        int arr[] = new int[n+1];
                        for (int i=0;i<n;i++){
                                int b=in.nextInt();
                                arr[b]++;
                        }
                        int sum=0;
                        for(int i=0;i<n+1;i++)
                        {
                                if(arr[i]>sum)
                                        sum=arr[i];
                        }
                        System.out.println(n-sum);

                }
        }

}
