package GreedyAlgorithm.Easy;

import java.util.Arrays;

//shortest job first
public class SJF_CPU_Scheduling {
    public static void main(String[] args) {
        int[] bt = {4,3,7,1,2};
        Arrays.sort(bt);
        int t = 0;
        int wt = 0;
        for(int i : bt){
            wt += t;
            t += i;
        }
        System.out.println(wt/bt.length);
    }
}
