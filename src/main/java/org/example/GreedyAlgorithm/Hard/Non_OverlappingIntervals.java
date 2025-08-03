package GreedyAlgorithm.Hard;

import java.util.Arrays;

public class Non_OverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int limit = intervals[0][1];
        int count = 1;
        for(int i=1;i<n;i++){
            if(limit<=intervals[i][0]){
                limit = intervals[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
