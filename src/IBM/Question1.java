package IBM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

    public static int countReplacements(int n, List<String> logs) {
        // Array to track consecutive error count for each server
        int[] errorCount = new int[n + 1]; // Assuming server IDs range from 1 to n
        int replacements = 0;

        for (String log : logs) {
            // Split the log into server ID and status
            String[] logParts = log.split(" ");
            String serverIdWithPrefix = logParts[0]; // e.g., "s1"
            String status = logParts[1]; // e.g., "error" or "success"

            // Extract the numeric part of the server ID (e.g., 1 from "s1")
            int serverId = Integer.parseInt(serverIdWithPrefix.substring(1));

            if (status.equals("error")) {
                errorCount[serverId]++;

                // If a server logs 3 consecutive errors, it's replaced
                if (errorCount[serverId] == 3) {
                    replacements++;
                    errorCount[serverId] = 0; // Reset the error count after replacement
                }
            } else {
                // Reset the error count if the status is not "error"
                errorCount[serverId] = 0;
            }
        }

        return replacements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of servers and logs
        int n = scanner.nextInt(); // Number of servers
        int m = scanner.nextInt(); // Number of logs
        scanner.nextLine(); // Consume the newline character

        List<String> logs = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            logs.add(scanner.nextLine().trim());
        }

        // Call the countReplacements method
        int result = countReplacements(n, logs);

        // Print the result
        System.out.println(result);

        scanner.close();
    }
}
