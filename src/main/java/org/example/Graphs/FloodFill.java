package org.example.Graphs;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,1,0,0,0},
                {1,1,0,0,0,2},
                {1,0,0,0,2,2},
                {0,0,0,2,2,2}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        if(image[sr][sc]!=color) dfs(image,image.length,image[0].length,sr,sc,color,image[sr][sc]);
        for(int[] i : image){
            System.out.println(Arrays.toString(i));
        }
    }
    private static void dfs(int[][] image,int row,int col, int r,int c,int setColor,int currentColor){
        if(r<0 || c<0 || r>=row || c>=col || image[r][c]!=currentColor) return;
        image[r][c] = setColor;
        dfs(image,row,col,r-1,c,setColor,currentColor);
        dfs(image,row,col,r,c-1,setColor,currentColor);
        dfs(image,row,col,r,c+1,setColor,currentColor);
        dfs(image,row,col,r+1,c,setColor,currentColor);
    }
}
