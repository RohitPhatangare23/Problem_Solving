package Contest;

import java.util.ArrayList;
import java.util.Collections;

public class _420_DFS_String_Palindrome {
    public long base = 911;
    public long mod = 1000000007L;

    public boolean[] findAnswer(int[] parent, String s) {
        int n = parent.length;

        // Create a list to hold the children of each node
        ArrayList<ArrayList<Integer>> children = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            children.add(new ArrayList<>());
        }

        // Populate the children lists based on the parent array
        for (int i = 0; i < n; i++) {
            if (parent[i] != -1) {
                children.get(parent[i]).add(i);
            }
        }

        // Sort the children for each node
        for (int i = 0; i < n; i++) {
            Collections.sort(children.get(i));
        }

        // Precompute powers of the base for hashing
        int maxLen = n + 1;
        long[] pow = new long[maxLen + 1];
        pow[0] = 1;
        for (int i = 1; i <= maxLen; i++) {
            pow[i] = (pow[i - 1] * base) % mod;
        }

        // Hash values for forward and reverse traversal
        long[] forwardHash = new long[n];
        long[] reverseHash = new long[n];
        int[] len = new int[n];

        // Start DFS traversal from the root (node 0)
        computeHashes(0, children, s, pow, forwardHash, reverseHash, len);

        // Check if the hashes are equal for palindrome checking
        boolean[] answer = new boolean[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (forwardHash[i] == reverseHash[i]);
        }

        return answer;
    }

    private void computeHashes(int x, ArrayList<ArrayList<Integer>> children, String s, long[] pow, long[] forwardHash, long[] reverseHash, int[] len) {
        len[x] = 1;
        forwardHash[x] = 0;

        // Process each child to compute hashes
        for (int y : children.get(x)) {
            computeHashes(y, children, s, pow, forwardHash, reverseHash, len);
            forwardHash[x] = (forwardHash[x] * pow[len[y]] + forwardHash[y]) % mod;
            len[x] += len[y];
        }

        // Update forward hash for the current node
        forwardHash[x] = (forwardHash[x] * base + (s.charAt(x) - 'a' + 1)) % mod;

        // Initialize reverse hash
        reverseHash[x] = (s.charAt(x) - 'a' + 1);
        ArrayList<Integer> childs = children.get(x);

        // Compute reverse hash by traversing children in reverse order
        for (int i = childs.size() - 1; i >= 0; i--) {
            int y = childs.get(i);
            reverseHash[x] = (reverseHash[x] * pow[len[y]] + reverseHash[y]) % mod;
        }
    }

    public static void main(String[] args) {
        _420_DFS_String_Palindrome sol = new _420_DFS_String_Palindrome();

        // Example test case
        int[] parent = {-1, 0, 0, 1, 1, 2};
        String s = "aababa";
        boolean[] result = sol.findAnswer(parent, s);

        // Print results
        for (boolean res : result) {
            System.out.println(res); // Expected output: [true, true, false, true, true, true]
        }
    }
}
