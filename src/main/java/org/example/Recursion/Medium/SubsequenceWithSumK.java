package Recursion.Medium;

public class SubsequenceWithSumK {
    private static int countSubsequenceWithTargetSum(int[] arr, int k, int i){
        if (i == arr.length || k<0) {
            return k == 0 ? 1 : 0;
        }
        int take = countSubsequenceWithTargetSum(arr,k-arr[i],i+1);
        int notTake = countSubsequenceWithTargetSum(arr,k,i+1);
        return take+notTake;
    }
    private static boolean isCountSubsequenceWithTargetSum(int[] arr, int k, int i){
        if (i == arr.length) {
            return k == 0 ? true : false;
        }
        boolean take = isCountSubsequenceWithTargetSum(arr,k-arr[i],i+1);
        boolean notTake = isCountSubsequenceWithTargetSum(arr,k,i+1);
        return take || notTake;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};
        int k = 3;
        int count = countSubsequenceWithTargetSum(arr,k,0);
        System.out.println(count);
        System.out.println(isCountSubsequenceWithTargetSum(arr,k,0));
    }
}
