package Practice.Easy;

public class _7_Char_Sequence {

    public static void main(String[] args) {
        String sentence="leetcode exercises sound delightful";
        boolean result=isCircularSentence(sentence);
        System.out.println(result);
    }
    public static boolean isCircularSentence(String sentence) {
        // Split the sentence into words by spaces
        String[] words = sentence.split(" ");

        // Check each word with the next word
        for (int i = 0; i < words.length - 1; i++) {
            // If the last character of the current word doesn't match the first character of the next word
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }

        // Check if the last character of the last word matches the first character of the first word
        if (words[words.length - 1].charAt(words[words.length - 1].length() - 1) != words[0].charAt(0)) {
            return false;
        }

        // If all checks passed, return true
        return true;
    }

}
