package LoveBabar_450_DSA.Arrays;

public class _34_Check_Pailindrome {
    // Driver code
    public static void main(String args[])
    {
        int[] arr = { 121, 131, 20 };

        // length of array
        int n = arr.length;

        boolean res = isPalinArray(arr, n);
        if (res == true)
            System.out.println("Array is a PalinArray");
        else
            System.out.println("Array is not a PalinArray");
    }
    static boolean isPalindrome(int N)
    {
        String str = "" + N;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    // Function to check
    // if an array is PalinArray or not
    static boolean isPalinArray(int[] arr, int n)
    {
        // Traversing each element of the array
        // and check if it is palindrome or not
        for (int i = 0; i < n; i++) {
            boolean ans = isPalindrome(arr[i]);
            if (ans == false)
                return false;
        }
        return true;
    }
}
/*

Output = Array is not a PalinArray

Complexity Analysis:

Time Complexity: O(n2) since we need to traverse every nested array in the worst case.
Auxiliary Space: O(1)

 */
