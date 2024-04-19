package ArrayMedium;

import java.util.HashMap;

public class MajorityEleNby2 {
    private static int majorityElement(int[] arr){
        int n = arr.length;
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>=n/2)
                ans = i;
        }
        return ans;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}