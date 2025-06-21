package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private static void combinationSum(int[] arr,int k,int ind,List<Integer> lst,List<List<Integer>> ans){
        if(ind==arr.length){
            if(k==0) ans.add(new ArrayList<>(lst));
            return;
        }
        if(arr[ind]<=k){
            lst.add(arr[ind]);
            combinationSum(arr,k-arr[ind],ind,lst,ans);
            lst.remove(lst.size()-1 );
        }
        combinationSum(arr,k,ind+1,lst,ans);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int k = 7;
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(arr,k,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
}
