package SlidingWindowTwoPointer;

public class MaxConsecutiveOneslll {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};//6
        int k = 3;
        int count = 0;
        int l = 0;
        int m = 0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) count++;
            while(count>k){
                if(nums[l]==0) count--;
                l++;
            }
            m = Math.max(m,r-l+1);
        }
        System.out.println(m);
    }
}
