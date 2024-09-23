package Basic_To_Advanced_ArrayQuestions;

public class _25_Subarray {
    public static void main(StringHackerRank[] args) {
        int[] arr={1,2,3,4};
        System.out.println("-----------Subarray---------");
        //findSubarray(arr);

        System.out.println("-----------Subsequence---------");
        findSubsequence(arr);


    }
    public static void findSubarray(int[] arr){
        int n=arr.length;
        for (int start=0;start<n;start++){
            for (int end=start;end<n;end++){
                System.out.print("[");
                for (int i=start;i<=end;i++){
                    System.out.print(arr[i]+"");
                }
                System.out.print("]");
            }
        }
        System.out.println();
    }

    public static void findSubsequence(int[] arr){
        int m=arr.length;
        int total=1<<m;
        for (int mask=0;mask<total;mask++){
            System.out.print("[");
            for (int i=0;i<m;i++){
                if ((mask & (1<<i))>0){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.print("] ");
        }
    }
}
