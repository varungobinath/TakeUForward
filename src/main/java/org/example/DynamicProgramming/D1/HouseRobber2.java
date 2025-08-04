package org.example.DynamicProgramming.D1;

public class HouseRobber2 {
//    private static int rob(int[] arr,int ind,int n){
//        if(ind>=n) return 0;
//        int take = arr[ind]+rob(arr,ind+2,n);
//        int notTake = rob(arr,ind+1,n);
//        return Math.max(take,notTake);
//    }
    private static int rob(int[] arr,int ind,int n,Integer[] dp){
        if(ind>=n) return 0;
        if(dp[ind]!=null) return dp[ind];
        int take = arr[ind]+rob(arr,ind+2,n,dp);
        int notTake = rob(arr,ind+1,n,dp);
        return dp[ind] = Math.max(take,notTake);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int n = arr.length;
        Integer[] dp = new Integer[n];
        Integer[] dp1 = new Integer[n];
        System.out.println(Math.max(rob(arr,0,n-1,dp),rob(arr,1,n,dp1)));
    }
}
