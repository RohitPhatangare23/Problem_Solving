package Accenture;

import java.util.*;

public class _10_Similar_Rectangle {
    public static int countNearlySimilarRectangles(List<List<Integer>> rectangles) {
        // Map to store the ratio of width to height in simplified form
        Map<String, Integer> ratioMap = new HashMap<>();
        int count = 0;

        for (List<Integer> rectangle : rectangles) {
            int width = rectangle.get(0);
            int height = rectangle.get(1);

            // Calculate the greatest common divisor (GCD)
            int gcd = gcd(width, height);

            // Simplify the ratio
            int simplifiedWidth = width / gcd;
            int simplifiedHeight = height / gcd;
            String ratio = simplifiedWidth + ":" + simplifiedHeight;

            // Count similar rectangles based on the ratio
            count += ratioMap.getOrDefault(ratio, 0);
            ratioMap.put(ratio, ratioMap.getOrDefault(ratio, 0) + 1);
        }

        return count;
    }

    // Helper method to calculate GCD
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Example input: List of rectangles where each rectangle is represented as [width, height]
        List<List<Integer>> rectangles = Arrays.asList(
//                Arrays.asList(2, 1),
//                Arrays.asList(10, 7),
//                Arrays.asList(9, 6),
//                Arrays.asList(6, 9),
//                Arrays.asList(7, 3));

                //or

                Arrays.asList(4,8),
                Arrays.asList(15,30),
                Arrays.asList(25,50)
        );


        int result = countNearlySimilarRectangles(rectangles);
        System.out.println("Number of nearly similar rectangles: " + result); // Output: 3
    }
}
