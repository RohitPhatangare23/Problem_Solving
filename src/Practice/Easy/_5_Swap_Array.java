package Practice.Easy;

public class _5_Swap_Array {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int n=arr.length;
        swapElements(arr, n);

        // Print the modified array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void swapElements(int[] arr, int n) {
        // Swap first half of the array with the second half elements
        for(int i=0;i<n-2;i++){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
    }
}
