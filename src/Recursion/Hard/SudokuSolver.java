package Recursion.Hard;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,9,5,0,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
        System.out.println(solve(board,0,0));
        for(int[] i : board){
            System.out.println(Arrays.toString(i));
        }
    }
    private static boolean solve(int[][] board,int r,int c){
        if(r==board.length) return true;
        if(c==board.length) return solve(board,r+1,0);
        if(board[r][c]!=0) return solve(board,r,c+1);
        for(int i=1;i<=9;i++){
            if(check(board,r,c,i)) {
                board[r][c] = i;
                if (solve(board, r, c + 1)) return true;
                board[r][c] = 0;
            }
        }
        return false;
    }
    private static boolean check(int[][] board,int r,int c,int num){
        for(int i=0;i<board.length;i++){
            if(board[r][i]==num) return false;
            if(board[i][c]==num) return false;
            int rowsub = 3*(r/3)+i/3;
            int colsub = 3*(c/3)+i%3;
            if (board[rowsub][colsub] == num) {
                return false;
            }
        }
        return true;
    }
}
