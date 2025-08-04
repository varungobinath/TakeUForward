package org.example.DynamicProgramming.D2;

public class MinPathSum {
    private static int minPathSumGrid(int[][] matrix,int r,int c,Integer[][] dp){
        if(r==0 && c==0) return matrix[0][0];
        if(r<0 || c<0) return (int)Math.pow(10,9);
        if(dp[r][c]!=null) return dp[r][c];
        int up = matrix[r][c] + minPathSumGrid(matrix,r-1,c,dp);
        int left = matrix[r][c] + minPathSumGrid(matrix,r,c-1,dp);
        return dp[r][c] = Math.min(up,left);
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {5, 9, 6},
                {11, 5, 2}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        Integer[][] dp = new Integer[row][col];
        System.out.println(minPathSumGrid(matrix,row-1,col-1,dp));
    }
}
