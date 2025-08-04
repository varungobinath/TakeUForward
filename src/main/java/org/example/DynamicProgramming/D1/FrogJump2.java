package org.example.DynamicProgramming.D1;

public class FrogJump2 {
    private static int minEnergyToJump(int[] arr, int k,int ind){
        if(ind==0) return 0;
        int minSteps = Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(ind-i>=0){
                minSteps = Math.min(minSteps,minEnergyToJump(arr,k,ind-i))+Math.abs(arr[ind]-arr[ind-i]);
            }
        }
        return minSteps;
    }
    public static void main(String[] args) {
        int[] arr = { 30, 10, 60, 10, 60, 50 };
        int k = 2;
        System.out.println(minEnergyToJump(arr,k,arr.length-1));
    }
}
