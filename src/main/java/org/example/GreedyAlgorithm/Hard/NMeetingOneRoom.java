package GreedyAlgorithm.Hard;

import java.lang.classfile.MethodTransform;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NMeetingOneRoom {
    static class Meeting{
        int start;
        int end;
        int pos;
        Meeting(int start,int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    public static void main(String[] args) {
        int[] start = {0,3,1,5,5,8};
        int[] end = {5,4,2,9,7,9};
        int n = start.length;
        Meeting[] meeting = new Meeting[n];
        for(int i=0;i<n;i++){
            meeting[i] = new Meeting(start[i],end[i],i+1);
        }
        Arrays.sort(meeting,(a,b)->{
            if(a.end<b.end) return -1;
            else if(a.end>b.end) return 1;
            else if(a.pos<b.pos) return -1;
            return 1;
        });
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meeting[0].pos);
        int limit = meeting[0].end;
        for(int i=1;i<n;i++){
            if(limit<meeting[i].start){
                limit = meeting[i].end;
                ans.add(meeting[i].pos);
            }
        }
        System.out.println(ans);
    }
}
