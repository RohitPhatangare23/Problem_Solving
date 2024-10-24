package CodeVita;

import java.util.*;

public class _5_Confilict_Free_Team {

    // Method to perform DFS and find all employees in a connected component
    private static void dfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, component);
            }
        }
    }

    // Main method to find the maximum expertise
    public static int maxExpertise(int n, int c, int[][] conflicts, int[] expertise) {
        // Create adjacency list to represent the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add conflict edges to the graph
        for (int[] conflict : conflicts) {
            int u = conflict[0];
            int v = conflict[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Array to track visited employees
        boolean[] visited = new boolean[n + 1];

        int maxTotalExpertise = 0;

        // Find all connected components using DFS
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, adj, visited, component);

                // Calculate the sum of expertise for this component
                int componentExpertiseSum = 0;
                for (int employee : component) {
                    componentExpertiseSum += expertise[employee - 1]; // employee ID is 1-based
                }

                // Update the maximum total expertise
                maxTotalExpertise = Math.max(maxTotalExpertise, componentExpertiseSum);
            }
        }

        return maxTotalExpertise;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n and c
        int n = sc.nextInt(); // Number of employees
        int c = sc.nextInt(); // Number of conflict pairs

        // Input conflict pairs
        int[][] conflicts = new int[c][2];
        for (int i = 0; i < c; i++) {
            conflicts[i][0] = sc.nextInt();
            conflicts[i][1] = sc.nextInt();
        }

        // Input expertise values
        int[] expertise = new int[n];
        for (int i = 0; i < n; i++) {
            expertise[i] = sc.nextInt();
        }

        // Output the maximum possible expertise
        System.out.println(maxExpertise(n, c, conflicts, expertise));

        sc.close();
    }
}

