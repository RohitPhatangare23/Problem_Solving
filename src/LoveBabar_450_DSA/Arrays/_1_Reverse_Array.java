package LoveBabar_450_DSA.Arrays;

public class _1_Reverse_Array {
    public static void main(String[] args) {
        //-------------- Input array ---------------
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of Elements do you want to Enter");
        int n=in.nextInt();
        int[] arr=new int[10];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //Print The element
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

         */
        /*-----------------  Approch ----------

        Array Reverse Using a Loop (In-place):
        Iterate through the array using two pointers (start and end).
        Swap elements at the start and end pointers.
        Move the start pointer towards the end and the end pointer towards the start until they meet or cross each other.
         */

        int[] array = {10, 20, 30, 40, 50};
        System.out.println("---------Optimal Way------------");
        reverseArray2(array, 0, 4);
        showArray(array);
    }

    public static void showArray(int[] array) {
        System.out.print("Reversed Array = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void reverseArray2(int[] array, int start, int end) {
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }


        /*

        OUTPUT : Reversed Array = 50 40 30 20 10

        Time Complexity: O(n)
        The loop runs through half of the array, so it’s linear with respect to the array size.

        Auxiliary Space Complexity: O(1)
        In-place reversal, meaning it doesn’t use additional space.
         */

    }
}
