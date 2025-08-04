package org.example.BasicRecursion;

public class PrintNTimes {
//    private static void print(int n){
//        if(n==3) return;
//        System.out.println(n);
//        print(n+1);
//    }
    private static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        print(9);
    }
}
