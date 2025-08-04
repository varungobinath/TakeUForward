package org.example.Graphs;

import java.util.Arrays;

public class SurroundedRegions {
    private static void dfs(char[][] board,int row,int col,int r,int c){
        if(r<0 || c<0 || r>=row || c>=col || board[r][c]=='X' || board[r][c]=='+') return;
        board[r][c] = '+';
        dfs(board,row,col,r-1,c);
        dfs(board,row,col,r,c-1);
        dfs(board,row,col,r,c+1);
        dfs(board,row,col,r+1,c);
    }
    public static void main(String[] args) {
        char[][] board = {
                {'X','X','X','X','X'},
                {'X','O','X','O','X'},
                {'X','O','X','O','X'},
                {'X','O','X','O','X'},
                {'X','X','X','O','X'}
        };
        int row = board.length;
        int col = board[0].length;
        for(int r=0;r<row;r++){
            if(board[r][0]=='O'){
                dfs(board,row,col,r,0);
            }
            if(board[r][col-1]=='O'){
                dfs(board,row,col,r,col-1);
            }
        }
        for(int c=0;c<col;c++){
            if(board[0][c]=='O'){
                dfs(board,row,col,0,c);
            }
            if(board[row-1][c]=='O'){
                dfs(board,row,col,row-1,c);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='+') board[i][j] = 'O';
                else if(board[i][j]=='O') board[i][j] = 'X';
            }
        }
        for(char[] ch : board){
            System.out.println(Arrays.toString(ch));
        }
    }
}
