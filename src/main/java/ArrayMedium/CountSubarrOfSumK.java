package ArrayMedium;

import java.util.HashMap;

public class CountSubarrOfSumK {
    private static int countSubarrOfSumk(int[] arr,int k){
        int sum = 0,count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        System.out.println(countSubarrOfSumk(arr,k));
    }
}
