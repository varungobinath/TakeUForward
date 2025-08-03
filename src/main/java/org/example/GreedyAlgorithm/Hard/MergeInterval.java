package GreedyAlgorithm.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        int idx = -1;
        for(int[] interval : intervals){
            if(result.isEmpty() || result.get(idx)[1]<interval[0]){
                result.add(interval);
                idx++;
            }else{
                result.get(idx)[1] = Math.max(result.get(idx)[1],interval[1]);
            }
        }
        for(int[] i : result){
            System.out.println(Arrays.toString(i));
        }
    }
}
