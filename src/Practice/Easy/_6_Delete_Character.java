package Practice.Easy;

public class _6_Delete_Character {
    public static void main(String[] args) {
        String str="leeetcode";
        System.out.println(makeFancyString(str));

    }
    public static String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        // Add the first character to result to start comparison
        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char lastChar = s.charAt(i - 1);

            if (currentChar == lastChar) {
                count++;
            } else {
                count = 1;
            }

            // Only add the character if the count is less than or equal to 2
            if (count <= 2) {
                result.append(currentChar);
            }
        }

        return result.toString();

    }
}
