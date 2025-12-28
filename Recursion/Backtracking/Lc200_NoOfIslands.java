package Recursion.Backtracking;
import java.util.*;

public class Lc200_NoOfIslands {
    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        Solution obj = new Solution();
        System.out.println(obj.numIslands(grid)); // Output: 3
    }
}

class Solution {

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {

        // boundary + water check
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] == '0') {
            return;
        }

        // mark visited
        grid[i][j] = '0';

        // explore 4 directions
        dfs(grid, i - 1, j); // up
        dfs(grid, i + 1, j); // down
        dfs(grid, i, j - 1); // left
        dfs(grid, i, j + 1); // right
    }
}
