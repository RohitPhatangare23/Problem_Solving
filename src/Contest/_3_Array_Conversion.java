package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_Array_Conversion {

    public static void main(String[] args) {
        // Sample input
        List<Integer> ar = Arrays.asList(4, 1, 3, 2, 1);

        // Call the conversion function and print the result
        List<Integer> result = conversion(ar);
        for (int elem : result) {
            System.out.println(elem);
        }
    }
    public static List<Integer> conversion(List<Integer> ar) {
        // Create a list to store the modified elements after conversion
        List<Integer> converted = new ArrayList<>();

        // Loop through each element in the array and apply the conversion rules
        for (int elem : ar) {
            if (elem == 1) {
                converted.add(2);  // Fire (1) converts to Water (2)
            } else if (elem == 2) {
                converted.add(3);  // Water (2) converts to Earth (3)
            } else if (elem == 3) {
                converted.add(4);  // Earth (3) converts to Air (4)
            } else if (elem == 4) {
                converted.add(1);  // Air (4) converts to Fire (1)
            }
        }

        // Return the modified array
        return converted;
    }

}
