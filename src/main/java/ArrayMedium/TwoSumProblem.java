package ArrayMedium;

import java.util.HashMap;

public class TwoSumProblem {
    private static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int remainder = target - nums[i];
            if(map.containsKey(remainder)) return new int[]{map.get(remainder),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
