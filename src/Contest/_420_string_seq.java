package Contest;

import java.util.ArrayList;
import java.util.List;

public class _420_string_seq {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            char targetChar = target.charAt(i);
            if (current.length() == 0) {
                // Initially, append 'a' using Key 1
                current.append('a');
                result.add(current.toString());
            } else {
                // Continue appending 'a' for every new character in the target
                current.append('a');
                result.add(current.toString());
            }

            // Now adjust the last character to match the targetChar using Key 2
            while (current.charAt(i) != targetChar) {
                char updatedChar = (char) (current.charAt(i) + 1);
                // Handle wrap-around from 'z' to 'a'
                if (updatedChar > 'z') {
                    updatedChar = 'a';
                }
                current.setCharAt(i, updatedChar);
                result.add(current.toString());
            }
        }

        return result;
    }

    // To test the function
    public static void main(String[] args) {
        _420_string_seq solution = new _420_string_seq();
        String target = "abc";
        List<String> output = solution.stringSequence(target);
        System.out.println(output);  // Output: ["a", "aa", "ab", "aba", "abb", "abc"]
    }
}
