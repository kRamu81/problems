package POTD.Leetcode;

import java.util.*;

public class PacificAtlanticOcean417 {

    // Directions: right, left, down, up
    private static final int[][] dir = { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        System.out.println(pacificAtlantic(matrix));
    }

    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();

        // Check for null or empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        // DFS from Pacific (top row and left column)
        for (int i = 0; i < cols; i++) {
            dfs(matrix, 0, i, Integer.MIN_VALUE, pacific);          // Top row (Pacific)
            dfs(matrix, rows - 1, i, Integer.MIN_VALUE, atlantic);  // Bottom row (Atlantic)
        }
        // DFS from Atlantic (bottom row and right column)
        for (int i = 0; i < rows; i++) {
            dfs(matrix, i, 0, Integer.MIN_VALUE, pacific);          // Left col (Pacific)
            dfs(matrix, i, cols - 1, Integer.MIN_VALUE, atlantic);  // Right col (Atlantic)
        }
        // Cells reachable by both oceans
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    public static void dfs(int[][] matrix, int i, int j, int prev, boolean[][] ocean) {
        // Boundary and validity checks
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) return;
        if (matrix[i][j] < prev || ocean[i][j]) return;
        ocean[i][j] = true;

        // Explore all 4 directions
        for (int[] d : dir) {
            dfs(matrix, i + d[0], j + d[1], matrix[i][j], ocean);
        }
    }
}
