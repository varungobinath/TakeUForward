package DynamicProgramming.D1;

public class HouseRobber {
//    private static int rob(int[] arr,int ind){
//        if(ind>=arr.length) return 0;
//        int take = arr[ind] + rob(arr,ind+2);
//        int notTake = rob(arr,ind+1);
//        return Math.max(take,notTake);
//    }
    private static int rob(int[] arr,int ind,Integer[] dp){
        if(ind>=arr.length) return 0;
        if(dp[ind]!=null) return dp[ind];
        int take = arr[ind] + rob(arr,ind+2,dp);
        int notTake = rob(arr,ind+1,dp);
        return Math.max(take,notTake);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,5,8,1,9};//24
        System.out.println(rob(arr,0,new Integer[arr.length]));
    }
}
