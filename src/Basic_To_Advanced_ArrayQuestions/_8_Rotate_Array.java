package Basic_To_Advanced_ArrayQuestions;

public class _8_Rotate_Array {
    public static void main(StringHackerRank[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=2;
        Rotate(arr,d,n);
        printTheArray(arr,n);
    }

    private static void Rotate(int[] arr, int d, int n) {
        int temp[]=new int[n];
        int k =0;
        for (int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for (int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        for (int i=0;i<n;i++){
            arr[i]=temp[i];

        }

    }

    private static void printTheArray(int[] arr, int n) {
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
