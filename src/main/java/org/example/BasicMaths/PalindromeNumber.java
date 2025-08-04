package org.example.BasicMaths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12321;
        String s = String.valueOf(n);
        String rev = reverse(s);
        System.out.println(s.equals(rev));
    }
    public static String reverse(String s){
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return new String(str);
    }
}
/*
Output:
true
 */