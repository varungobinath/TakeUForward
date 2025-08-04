package org.example.DynamicProgramming.D2;

public class Triangle {
    private static int minimumPathSum(int[][] triangle,int r,int c,Integer[][] dp){
        if(r==triangle.length-1) return triangle[r][c];
        if(dp[r][c]!=null) return dp[r][c];
        int down = triangle[r][c]+minimumPathSum(triangle,r+1,c,dp);
        int left = triangle[r][c]+minimumPathSum(triangle,r+1,c+1,dp);
        return dp[r][c] = Math.min(down,left);
    }
    public static void main(String[] args) {
        int triangle[][] = {{1},
                {2, 3},
                {3, 6, 7},
                {8, 9, 6, 10}};

        int n = triangle.length;
        Integer[][] dp = new Integer[n][n];
        System.out.println(minimumPathSum(triangle, 0,0,dp));
    }
}
