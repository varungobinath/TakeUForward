package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    private static void generateParenthesis(int n,List<String> ans,String str,int open,int close){
        if(str.length()==2*n){
            ans.add(str);
            return;
        }
        if(open<n){
            generateParenthesis(n,ans,str+"(",open+1,close);
        }
        if(close<open){
            generateParenthesis(n,ans,str+")",open,close+1);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = new ArrayList<>();
        generateParenthesis(n,ans,"",0,0);
        System.out.println(ans);
    }
}
