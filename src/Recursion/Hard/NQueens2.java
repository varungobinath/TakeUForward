package Recursion.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens2 {
    private static boolean isSafe(int[][] board, int row, int col, int n) {
        int i, j;

        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; i < n && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    private static void solve(int[][] board, int col, int n, List<int[][]> ans) {
        if (col == n) {
            // Deep copy the board and store in ans
            int[][] solution = new int[n][n];
            for (int i = 0; i < n; i++)
                solution[i] = board[i].clone();
            ans.add(solution);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                solve(board, col + 1, n, ans);
                board[row][col] = 0; // backtrack
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int[n][n];
        List<int[][]> ans = new ArrayList<>();
        solve(board, 0, n, ans);

        if (ans.isEmpty()) {
            System.out.println("No solution exists.");
        } else {
            int count = 1;
            for (int[][] solution : ans) {
                System.out.println("Solution #" + count++);
                for (int[] row : solution) {
                    System.out.println(Arrays.toString(row));
                }
                System.out.println();
            }
        }
    }
}
