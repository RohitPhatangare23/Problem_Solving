package Practice.Easy;

import java.util.HashMap;
import java.util.Map;

public class _8_Rotate_String {
    public static void main(String[] args) {
        String s="";
        String goal="";
        boolean result=rotateString(s,goal);
        System.out.println(result);
    }
    public static boolean rotateString(String s, String goal) {
        // If lengths are not the same, s can't be rotated to match goal
        if (s.length() != goal.length()) {
            return false;
        }

        // Check if goal is a substring of s + s
        String concatenated = s + s;
        return concatenated.contains(goal);
    }


}
