package Recursion.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubSetSumII {
    private static void subsetSum(int[] arr,int ind,List<Integer> lst,List<List<Integer>> ans){
        ans.add(new ArrayList<>(lst));
        for(int i=ind;i<arr.length;i++){
            lst.add(arr[i]);
            subsetSum(arr,i+1,lst,ans);
            lst.remove(lst.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = new ArrayList<>();
        subsetSum(arr,0,new ArrayList<>(),ans);
        System.out.println(new HashSet<>(ans));
    }
}
