package org.example.DynamicProgramming.D2;

public class NinjaTraning {
    private static int maxTraining(int[][] points, int last, int day,Integer[][] dp){
        if(day>=points.length) return 0;
        if(dp[day][last+1]!=null) return dp[day][last+1];
        int max = 0;
        for(int i=0;i<points.length;i++){
            if(i!=last){
                max = Math.max(max,points[day][i]+maxTraining(points,i,day+1,dp));
            }
        }
        return dp[day][last+1] = max;
    }
    public static void main(String[] args) {
        int[][] points = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        int n = points.length;
        Integer[][] dp = new Integer[n][n+1];
        System.out.println(maxTraining(points,-1,0,dp));  // Output: 210
    }
}
