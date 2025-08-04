package org.example.Graphs;

import java.util.Arrays;

public class SurroundedRegions2 {
    static int count_lake = 0,count_river = 0;
    static int max_lake = 0,max_river = 0;
    private static int dfs(char[][] board,int row,int col,int r,int c){
        if(r<0 || c<0 || r>=row || c>=col || board[r][c]=='X' || board[r][c]=='+') return 0;
        board[r][c] = '+';
        int size = 1;
        size += dfs(board,row,col,r-1,c);
        size += dfs(board,row,col,r,c-1);
        size += dfs(board,row,col,r,c+1);
        size += dfs(board,row,col,r+1,c);
        return size;
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
                max_river = Math.max(max_river,dfs(board,row,col,r,0));
                count_river++;
            }
            if(board[r][col-1]=='O'){
                max_river = Math.max(max_river,dfs(board,row,col,r,col-1));
                count_river++;
            }
        }
        for(int c=0;c<col;c++){
            if(board[0][c]=='O'){
                max_river = Math.max(max_river,dfs(board,row,col,0,c));
                count_river++;
            }
            if(board[row-1][c]=='O'){
                max_river = Math.max(max_river,dfs(board,row,col,row-1,c));
                count_river++;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    max_lake = Math.max(max_lake,dfs(board,row,col,i,j));
                    count_lake++;
                }
            }
        }
        System.out.println(count_lake+" "+max_lake);
        System.out.println(count_river+" "+max_river);
        for(char[] ch : board){
            System.out.println(Arrays.toString(ch));
        }
    }
}
