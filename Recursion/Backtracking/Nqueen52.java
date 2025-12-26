package Recursion.Backtracking;

import java.util.*;

class Solution {

    int count = 0;
    char[][] board;

    // LeetCode 52 required method
    public int totalNQueens(int n) {

        board = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0);
        return count;
    }

    private void solve(int row) {

        // base case
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 'Q';
                solve(row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    private boolean isSafe(int row, int col) {

        // column check
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // left diagonal check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // right diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }
}

// For local testing (optional)
public class Nqueen52 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.totalNQueens(4));
    }
}
