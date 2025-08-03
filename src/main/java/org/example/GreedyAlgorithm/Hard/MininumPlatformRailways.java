package GreedyAlgorithm.Hard;

import java.util.Arrays;

public class MininumPlatformRailways {
    public static void main(String[] args) {
        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max = 0;
        int count = 0;
        int i=0,j=0,n=arr.length;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                count++;
                i++;
            }else{
                count--;
                j++;
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
