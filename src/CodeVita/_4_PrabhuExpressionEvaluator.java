package CodeVita;

import java.util.*;

public class _4_PrabhuExpressionEvaluator {

    // Maps for digits and operations
    private static final Map<String, Integer> digitMap = new HashMap<>();
    private static final Map<String, String> operationMap = new HashMap<>();

    static {
        digitMap.put("zero", 0);
        digitMap.put("one", 1);
        digitMap.put("two", 2);
        digitMap.put("three", 3);
        digitMap.put("four", 4);
        digitMap.put("five", 5);
        digitMap.put("six", 6);
        digitMap.put("seven", 7);
        digitMap.put("eight", 8);
        digitMap.put("nine", 9);

        operationMap.put("add", "+");
        operationMap.put("sub", "-");
        operationMap.put("mul", "*");
        operationMap.put("rem", "%");
        operationMap.put("pow", "^");
    }

    // Function to convert word number (like "onecone") to actual number
    private static int convertWordNumber(String wordNumber) {
        String[] parts = wordNumber.split("c");
        int num = 0;
        for (String part : parts) {
            if (!digitMap.containsKey(part)) {
                return -1; // Invalid part
            }
            num = num * 10 + digitMap.get(part);
        }
        return num;
    }

    // Function to evaluate two-operand expression
    private static int evaluateExpression(int operand1, String operation, int operand2) {
        switch (operation) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "%":
                return operand1 % operand2;
            case "^":
                return (int) Math.pow(operand1, operand2);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] tokens = input.split(" ");

        List<String> operations = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        for (String token : tokens) {
            if (operationMap.containsKey(token)) {
                operations.add(token);
            } else {
                numbers.add(token);
            }
        }

        if (operations.isEmpty() || numbers.isEmpty() || operations.size() >= numbers.size()) {
            System.out.println("expression is not complete or invalid");
            return;
        }

        // Convert numbers
        List<Integer> operands = new ArrayList<>();
        for (String num : numbers) {
            int val = convertWordNumber(num);
            if (val == -1) {
                System.out.println("expression evaluation stopped invalid words present");
                return;
            }
            operands.add(val);
        }

        // Evaluate the expression
        int result = operands.get(0);
        int opIdx = 0;
        for (int i = 1; i < operands.size(); i++) {
            String operation = operationMap.get(operations.get(opIdx++));
            result = evaluateExpression(result, operation, operands.get(i));
        }

        System.out.println(result);
    }
}
