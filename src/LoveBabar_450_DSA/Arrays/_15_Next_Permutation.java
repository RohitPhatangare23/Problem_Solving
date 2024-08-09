package LoveBabar_450_DSA.Arrays;

public class _15_Next_Permutation {
    // Driver code
    public static void main(String[] args)
    {

        String str2 = "Rohit";  // Example 2
        System.out.println(nextPermutation(str2));

    }
    public static char[] nextPermutation(String s) {
        // Convert the input string to a list of characters
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = n - 2;
        // Find the largest index i such that arr[i] < arr[i+1]
        while (i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }
        // If no such index exists, return "No next Permutation"
        if (i < 0) {
            String st = "No next Permutation possible";
            char[] ar = st.toCharArray();
            return ar;
        }
        int j = n - 1;
        // Find the largest index j such that arr[i] < arr[j]
        while (j >= 0 && arr[j] <= arr[i]) {
            j--;
        }
        // Swap arr[i] and arr[j]
        swap(arr, i, j);
        //Reverse the sublist arr[start:end+1]
        rev(arr, i+1, n-1);
        return arr;
    }

    // Function to swap two numbers
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Function to reverse the array
    private static void rev(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
