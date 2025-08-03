package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class SubSetSum {
    private static void subsetSum(int[] arr,int ind,int sum,List<Integer> ans){
        if(ind==arr.length){
            ans.add(sum);
            return;
        }
        subsetSum(arr,ind+1,sum+arr[ind],ans);
        subsetSum(arr,ind+1,sum,ans);
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1};
//        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        subsetSum(arr,0,0,ans);
        System.out.println(ans);
    }
}
