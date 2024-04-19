package ArrayMedium;

import java.util.Arrays;

public class LongestConsicutiveSequence {
    private static int longestSuccessiveElements(int[] nums){
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int lastsmallest = Integer.MAX_VALUE;
        int count = 0;
        int longest = 1;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastsmallest){
                count++;
            }else if(nums[i]!=lastsmallest){
                count = 1;
            }
            lastsmallest = nums[i];
            longest = Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println(ans);
    }
}
