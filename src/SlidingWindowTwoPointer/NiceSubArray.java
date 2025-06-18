package SlidingWindowTwoPointer;

public class NiceSubArray {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};//16
        int k = 2;
        System.out.println(helper(nums,k)-helper(nums,k-1));
    }
    private static int helper(int[] nums,int k){
        int count = 0;
        int l = 0;
        int sum = 0;
        for(int r=0;r<nums.length;r++){
            sum += nums[r]%2;
            while(sum>k){
                sum -= nums[l]%2;
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}
