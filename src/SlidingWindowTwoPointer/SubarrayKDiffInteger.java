package SlidingWindowTwoPointer;

import java.util.HashMap;

public class SubarrayKDiffInteger {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3};//7
        int k = 2;
        System.out.println(helper(nums,k)-helper(nums,k-1));
    }
    private static int helper(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int m = 0,l = 0;
        for(int r=0;r<arr.length;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.size()>k){
                map.put(arr[l],map.getOrDefault(arr[l],0)-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}
