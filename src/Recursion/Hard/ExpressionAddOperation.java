package Recursion.Hard;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperation {
    public static void main(String[] args) {
        String num = "232";
        int target = 8;
        List<String> ans = new ArrayList<>();
        backtracking(num,target,1,num.charAt(0)-'0',num.charAt(0)-'0',String.valueOf(num.charAt(0)),ans);
        System.out.println(ans);
    }
    private static void backtracking(String num,int target,int idx,int t,int prev,String s,List<String> ans){
        if(idx==num.length()){
            if(t==target)  ans.add(s);
            return;
        }
        int n = num.charAt(idx)-'0';
        backtracking(num,target,idx+1,t+n,n,s+"+"+n,ans);
        backtracking(num,target,idx+1,t-n,-n,s+"-"+n,ans);
        backtracking(num,target,idx+1,t - prev + (prev * n),prev*n,s+"*"+n,ans);
    }
}
