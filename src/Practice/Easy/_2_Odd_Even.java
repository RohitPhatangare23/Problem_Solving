package Practice.Easy;

public class _2_Odd_Even {
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5};
        OECount(array);



    }

    private static void OECount(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        // Traverse the array and count odd and even numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output the odd count followed by the even count on the same line
        System.out.println(oddCount + " " + evenCount);

    }
}
