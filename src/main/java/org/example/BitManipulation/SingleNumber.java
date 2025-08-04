package org.example.BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans = 0;
        for(int i : arr) ans ^= i;
        System.out.println(ans);
    }
}
