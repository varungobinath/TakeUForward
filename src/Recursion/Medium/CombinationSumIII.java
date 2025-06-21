package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void backtracking(int ind, int k, int n, List<List<Integer>> ans, List<Integer> lst){
        if(lst.size()==k){
            if(n==0) ans.add(new ArrayList<>(lst));
            return;
        }
        for(int i=ind;i<=9;i++){
            lst.add(i);
            backtracking(i+1,k,n-i,ans,lst);
            lst.remove(lst.size()-1);
        }
    }
    public static void main(String[] args) {
        int k = 3,n = 9;
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(1,k,n,ans,new ArrayList<>());
        System.out.println(ans);
    }
}
