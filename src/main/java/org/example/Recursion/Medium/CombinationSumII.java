package Recursion.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    private static void combinationSum(int[] arr,int k,int ind,List<Integer> lst,List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(lst));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(ind<i && arr[i]==arr[i-1]) continue;//
            lst.add(arr[i]);
            combinationSum(arr,k-arr[i],i+1,lst,ans);
            lst.remove(lst.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr ={10,1,2,7,6,1,5};
        int k = 8;
        Arrays.sort(arr);//
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(arr,k,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
}
