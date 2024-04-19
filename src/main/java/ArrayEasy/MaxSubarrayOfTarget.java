package ArrayEasy;

import java.util.HashMap;

public class MaxSubarrayOfTarget {
    private static int MaxSubarrayofk(int[] arr,int k){
        int n = arr.length;
        int max = 0;
        for(int i=0;i<n;i++){
            int s = 0;
            for(int j=i;j<n;j++){
                s += arr[j];
                if(s==k)
                    max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
    private static int maxSubarrayofk(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int ans = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            System.out.println(map);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        System.out.println(MaxSubarrayofk(a,k));
        System.out.println(maxSubarrayofk(a,k));
    }
}
