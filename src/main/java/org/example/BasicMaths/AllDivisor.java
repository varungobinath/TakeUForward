package org.example.BasicMaths;

public class AllDivisor {
    public static void main(String[] args) {
        int n = 36;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i)
                    System.out.print(n/i + " ");
            }
        }
    }
}
//1 36 2 18 3 12 4 9 6