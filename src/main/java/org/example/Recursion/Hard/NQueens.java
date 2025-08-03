package Recursion.Hard;

import java.util.Arrays;

public class NQueens {
    private static boolean isSafe(int[][] board,int row,int col,int n){
        int i,j;
        for(i=0;i<col;i++)
        {
            if(board[row][i]==1)
                return false;
        }
        for(i=row,j=col; i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=col; j>=0&&i<n;i++,j--)
            if(board[i][j]==1)
                return false;

        return true;
    }
    private static boolean solve(int[][] board,int col,int n){
        if(col==n) return true;
        for(int r=0;r<n;r++){
            if(isSafe(board,r,col,n)){
                board[r][col] = 1;
                if(solve(board,col+1,n)) return true;
                board[r][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        if(!solve(board,0,n)){
            System.out.println("no solution");
        }
        for(int[] i : board){
            System.out.println(Arrays.toString(i));
        }
    }
}
