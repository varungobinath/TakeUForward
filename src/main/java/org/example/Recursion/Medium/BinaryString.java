package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryString {
    static int i = 0;
    private static void generateBinaryString(int n,List<String> ans,String str){
        if(str.length()==n){
            ans.add(str);
            System.out.println(i+" -> "+str);
            i++;
            return;
        }
        generateBinaryString(n,ans,str+'0');
        generateBinaryString(n,ans,str+'1');
    }
    public static void main(String[] args) {
        int n = 5;
        List<String> ans = new ArrayList<>();
        generateBinaryString(n,ans,"");
        System.out.println(ans);
    }
}