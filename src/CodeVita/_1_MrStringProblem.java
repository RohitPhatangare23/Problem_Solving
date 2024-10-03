package CodeVita;

import java.util.*;

public class _1_MrStringProblem {

    // Function to get the textual representation of the numbers
    public static String numberToWords(int num) {
        String[] belowTwenty = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num == 100) return "hundred"; // Special case for 100
        if (num < 20) return belowTwenty[num];
        if (num < 100) return tens[num / 10] + ((num % 10 != 0) ? belowTwenty[num % 10] : "");

        return ""; // This case will not occur in the given constraints
    }

    // Function to count vowels in a string
    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++; // Check if the character is a vowel
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements N
        int N = sc.nextInt();
        int[] numbers = new int[N];

        // Input list of numbers
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // Calculate digit D by summing up vowels
        int totalVowels = 0;
        for (int i = 0; i < N; i++) {
            String word = numberToWords(numbers[i]);
            totalVowels += countVowels(word);
        }

        // Now we have digit D
        int D = totalVowels;

        // Find all unordered pairs that sum up to D
        int pairCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (numbers[i] + numbers[j] == D) {
                    pairCount++;
                }
            }
        }

        // Output the result
        if (pairCount > 100) {
            System.out.println("greater 100");
        } else {
            System.out.println(numberToWords(pairCount));
        }

        sc.close();
    }
}
