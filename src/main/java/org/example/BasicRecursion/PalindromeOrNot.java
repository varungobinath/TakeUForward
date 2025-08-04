package org.example.BasicRecursion;

public class PalindromeOrNot {
    private static boolean isPalin(String s,int i,int j){
        if(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            return isPalin(s,i+1,j-1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(isPalin(s,0,s.length()-1));
    }
}
