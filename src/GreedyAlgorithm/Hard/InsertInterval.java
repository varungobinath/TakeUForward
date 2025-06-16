package GreedyAlgorithm.Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,4},{5,7},{8,10},{12,13}};
        int[] newInterval = {6,8};
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        //left
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        //middle
        while(i<n && intervals[i][0]<newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        //right
        while(i<n){
            res.add(intervals[i++]);
        }
        for(int[] inte : res){
            System.out.println(Arrays.toString(inte));
        }
    }
}
