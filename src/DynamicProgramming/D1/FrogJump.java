package DynamicProgramming.D1;

public class FrogJump {
//    private static int minEneryToJump(int[] arr,int ind){
//        if(ind==0) return 0;
//        int jumpTwo = Integer.MAX_VALUE;
//        int jumpOne = minEneryToJump(arr,ind-1)+Math.abs(arr[ind]-arr[ind-1]);
//        if(ind>1)
//        jumpTwo = minEneryToJump(arr,ind-2)+Math.abs(arr[ind]-arr[ind-2]);
//        return Math.min(jumpTwo,jumpOne);
//    }
private static int minEneryToJump(int[] arr,int ind,Integer[] dp){
    if(ind==0) return 0;
    if(dp[ind]!=null) return dp[ind];
    int jumpTwo = Integer.MAX_VALUE;
    int jumpOne = minEneryToJump(arr,ind-1,dp)+Math.abs(arr[ind]-arr[ind-1]);
    if(ind>1)
        jumpTwo = minEneryToJump(arr,ind-2,dp)+Math.abs(arr[ind]-arr[ind-2]);
    return dp[ind] = Math.min(jumpTwo,jumpOne);
}
    public static void main(String[] args) {
        int[] arr = {10,20,30,10};
        Integer[] dp = new Integer[arr.length];
        System.out.println(minEneryToJump(arr,arr.length-1,dp));
    }
}
