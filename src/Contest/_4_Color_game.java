package Contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4_Color_game {
    public static void main(String[] args) {
        // Sample input
        String C = "RedYellowPink";
        String result=color_game(C);
        // Call the color_game function and print the result
        System.out.println(result);  // Expected output: "adf"
    }
    public static String color_game(String C) {
        // Define the mapping of colors to characters
        Map<String, Character> colorMapping = new HashMap<>();
        colorMapping.put("Red", 'a');
        colorMapping.put("Green", 'b');
        colorMapping.put("Blue", 'c');
        colorMapping.put("Yellow", 'd');
        colorMapping.put("Orange", 'e');
        colorMapping.put("Pink", 'f');

        // List of valid color codes
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange", "Pink");

        StringBuilder decodedMessage = new StringBuilder();

        // Variable to keep track of the current position in the string
        int i = 0;

        // Iterate over the input string and decode based on the color codes
        while (i < C.length()) {
            for (String color : colors) {
                // Check if the current part of the string matches a color code
                if (C.regionMatches(true, i, color, 0, color.length())) {
                    decodedMessage.append(colorMapping.get(color));
                    i =i+ color.length();  // Move to the next part of the string
                    break;
                }
            }
        }

        return decodedMessage.toString();
    }


}
