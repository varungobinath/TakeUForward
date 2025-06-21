package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhoneNumber {
    private static void backtracking(List<String> ans,String[] keyboard,String digits,String current,int index){
        if(index==digits.length()){
            ans.add(current);
            return;
        }
        String letters = keyboard[digits.charAt(index)-'0'];
        for(char letter : letters.toCharArray()){
            backtracking(ans,keyboard,digits,current+letter,index+1);
        }
    }
    public static void main(String[] args) {
        String[] keyboard = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String digits = "23";
        List<String> ans = new ArrayList<>();
        backtracking(ans,keyboard,digits,"",0);
        System.out.println(ans);
    }
}
