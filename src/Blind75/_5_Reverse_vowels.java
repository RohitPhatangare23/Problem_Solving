package Blind75;

public class _5_Reverse_vowels {
    public static void main(String[] args) {
        String str="Leetcode";
        System.out.println(reverseVowels(str));
    }
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] sChar = s.toCharArray();

        // While we still have characters to traverse
        while (start < end) {
            // Find the leftmost vowel
            while (start < end && !isVowel(sChar[start])) {
                start++;
            }
            // Find the rightmost vowel
            while (start < end && !isVowel(sChar[end])) {
                end--;
            }
            // Swap them if start is left of end
            if (start < end) {
                swap(sChar, start++, end--);
            }
        }

        // Converting char array back to String
        return new String(sChar);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }

    private static void swap(char[] sChar, int i, int j) {
        char temp = sChar[i];
        sChar[i] = sChar[j];
        sChar[j] = temp;
    }

}
