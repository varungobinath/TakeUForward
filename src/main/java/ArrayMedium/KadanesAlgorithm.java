package ArrayMedium;

public class KadanesAlgorithm {
    private static int maxSubarraySum(int[] nums){
        int max = Integer.MIN_VALUE,sum=0;
        for(int i : nums){
            sum += i;
            max = Math.max(max,sum);
            if(sum<0) sum = 0;
        }
        return max;
    }
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr);
        System.out.println(maxSum);
    }
}
