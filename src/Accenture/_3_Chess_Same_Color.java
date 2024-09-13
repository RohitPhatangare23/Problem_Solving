package Accenture;

public class _3_Chess_Same_Color {
    public static boolean isSameColor(String coordinate1, String coordinate2) {
        // Function to convert column letter to number
        int col1 = coordinate1.charAt(0) - 'a' + 1;
        int row1 = Character.getNumericValue(coordinate1.charAt(1));

        int col2 = coordinate2.charAt(0) - 'a' + 1;
        int row2 = Character.getNumericValue(coordinate2.charAt(1));

        // Calculate the sum of the positions
        int sum1 = col1 + row1;
        int sum2 = col2 + row2;

        // Check if both sums have the same parity
        return (sum1 % 2) == (sum2 % 2);
    }

    public static void main(String[] args) {
        String coordinate1 = "a1";
        String coordinate2 = "h3";

        System.out.println(isSameColor(coordinate1, coordinate2));  // Output: true
    }
}
