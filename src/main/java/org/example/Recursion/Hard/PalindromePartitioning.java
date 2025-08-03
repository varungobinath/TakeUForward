package Recursion.Hard;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aabb";
        List<List<String>> ans = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    private static void backtrack(String s, int start, List<String> path, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end )) {
                path.add(s.substring(start, end+1));
                backtrack(s, end+1, path, result);
                path.remove(path.size() - 1);
            }
        }
    }
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
