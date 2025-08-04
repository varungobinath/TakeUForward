package org.example.BasicMaths;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrime(n));
    }
    private static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
