package org.example.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {//print all subset

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        int subset = 1<<n;
        List<List<Integer>> ans = new ArrayList<>();
        for(int num=0;num<subset;num++){
            List<Integer> lst = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0) lst.add(nums[i]);
            }
            ans.add(new ArrayList<>(lst));
        }
        System.out.println(ans);
    }
}
