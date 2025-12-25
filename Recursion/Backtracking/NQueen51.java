package Recursion.Backtracking;

import java.util.*;

public class NQueen51 {

    // Initialize the result as empty
    List<List<String>> res = new ArrayList<>();
    char[][] board;

    public List<List<String>> solveQueens(int n) {
        board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start placing queens from row 0
        solve(0);
        return res;
    }

    private void solve(int row) {

        // Base case
        if (row == board.length) {
            res.add(constructBoard());
            return;
        }

        // Try to place queen in every column
        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 'Q';
                solve(row + 1);          // move to next row
                board[row][col] = '.';  // backtrack
            }
        }
    }

    // Check if queen can be placed safely
    private boolean isSafe(int row, int col) {

        // Column check
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Left diagonal check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Right diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }



    private List<String> constructBoard() {
        List<String> list = new ArrayList<>();
        for (char[] row : board) {
            list.add(new String(row));
        }
        return list;
    }


    public static void main(String[] args) {
        NQueen51 nq = new NQueen51();

        int n = 4;
        List<List<String>> res = nq.solveQueens(n);

        for (List<String> board : res) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
