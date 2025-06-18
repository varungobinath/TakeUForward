package SlidingWindowTwoPointer;
/*count of subarrays which sum = goal*/
public class BinarySubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(helper(nums,goal)-helper(nums,goal-1));
    }
    private static int helper(int[] nums,int goal){
        int l = 0;
        int sum = 0;
        int count = 0;
        for(int r=0;r<nums.length;r++){
            sum += nums[r];
            while(sum>goal && l<=r){
                sum -= nums[l++];
            }
            count += r-l+1;
        }
        return count;
    }
}
