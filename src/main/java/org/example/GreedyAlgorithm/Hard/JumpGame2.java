package GreedyAlgorithm.Hard;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,1,1,1,2};//3 - minimun jumps
        int n = arr.length;
        Integer[][] dp = new Integer[n][n];
        System.out.println(f(arr,0,0,dp));
    }
    private static int f(int[] arr,int ind,int jumps,Integer[][] dp){
        if(ind>=arr.length-1) return jumps;
        if(dp[ind][jumps]!=null) return dp[ind][jumps];
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=arr[ind];i++){
            min = Math.min(min,f(arr,ind+i,jumps+1,dp));
        }
        return dp[ind][jumps] = min;
    }
}
