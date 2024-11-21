package CodeVita;

import java.util.*;

public class _7_JustifyWords {
    static int K, N, M;
    static List<String> words;
    static int maxCnt = 0;

    // Backtracking function to try to fit words into the lines
    public static void backtrack(int i, int[] lines, int cnt, List<String> w) {
        if (i == w.size()) {
            if (cnt > maxCnt) maxCnt = cnt;
            return;
        }
        // Prune the search space if it's impossible to beat the current max count
        if (cnt + (w.size() - i) <= maxCnt) return;

        for (int j = 0; j < N; j++) {
            if (lines[j] == 0) {
                lines[j] = w.get(i).length();
                backtrack(i + 1, lines, cnt + 1, w);
                lines[j] = 0;
                break;
            } else {
                if (lines[j] + 1 + w.get(i).length() <= M) {
                    lines[j] += 1 + w.get(i).length();
                    backtrack(i + 1, lines, cnt + 1, w);
                    lines[j] -= 1 + w.get(i).length() + 1;
                }
            }
        }
        backtrack(i + 1, lines, cnt, w);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input values
        K = sc.nextInt();
        words = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            words.add(sc.next());
        }
        N = sc.nextInt();
        M = sc.nextInt();

        // Filter valid words that fit within the line limit M
        List<String> valid = new ArrayList<>();
        for (String word : words) {
            if (word.length() <= M) valid.add(word);
        }

        // Sort the words in descending order of length, then alphabetically
        valid.sort((a, b) -> {
            if (a.length() != b.length()) return Integer.compare(b.length(), a.length());
            return a.compareTo(b);
        });

        // Initialize an array to store the current lengths of each line
        int[] lines = new int[N];

        // Start the backtracking search
        backtrack(0, lines, 0, valid);

        // Output the maximum number of words that can be arranged
        System.out.println(maxCnt);

        sc.close();
    }
}