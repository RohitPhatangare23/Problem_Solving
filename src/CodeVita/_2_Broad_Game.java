package CodeVita;

import java.util.*;

public class _2_Broad_Game {
    // Helper method to rotate the move rule to the right (90 degrees clockwise)
    private static int[] rotateRight(int[] move) {
        return new int[]{move[1], -move[0]};
    }

    // Helper method to rotate the move rule to the left (90 degrees counterclockwise)
    private static int[] rotateLeft(int[] move) {
        return new int[]{-move[1], move[0]};
    }

    // Helper method to rotate the move rule backward (180 degrees)
    private static int[] rotateBack(int[] move) {
        return new int[]{-move[0], -move[1]};
    }

    // BFS function to find the minimum moves
    public static int bfs(int[][] grid, int[] start, int[] dest, int[] moveRule) {
        int M = grid.length;
        int N = grid[0].length;

        // Define directions (forward, right, left, back)
        int[][] directions = new int[][]{
                moveRule,
                rotateRight(moveRule),
                rotateLeft(moveRule),
                rotateBack(moveRule)
        };

        // BFS queue to store (x, y, distance)
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1], 0});

        // Visited array to mark the visited cells
        boolean[][] visited = new boolean[M][N];
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], dist = curr[2];

            // If the destination is reached, return the distance
            if (x == dest[0] && y == dest[1]) {
                return dist;
            }

            // Try moving in all four directions
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                // Check if the new cell is valid and not visited
                if (newX >= 0 && newX < M && newY >= 0 && newY < N && grid[newX][newY] == 0 && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX, newY, dist + 1});
                }
            }
        }

        // If destination is unreachable
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input grid dimensions
        int M = sc.nextInt();
        int N = sc.nextInt();

        // Input grid
        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Input source and destination cells
        int[] source = new int[]{sc.nextInt(), sc.nextInt()};
        int[] destination = new int[]{sc.nextInt(), sc.nextInt()};

        // Input movement rule
        int[] moveRule = new int[]{sc.nextInt(), sc.nextInt()};

        // Perform BFS to find the minimum moves
        int result = bfs(grid, source, destination, moveRule);
        System.out.println(result);
    }
}

