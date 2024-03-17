package BasicHashing;

import java.util.HashMap;

public class CountFrequencyinArray {
    private static void countFreq(int[] arr){
        int[] hash = new int[16];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<16;i++){
            if(hash[i]>0)
                System.out.println(i+" "+hash[i]);
        }
    }
    private static void countFreqHM(int[] arr){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value = hash.getOrDefault(arr[i],0);
            hash.put(arr[i],value+1);
        }
        for(int i : hash.keySet()){
            System.out.println(i+" "+hash.get(i));
        }
        System.out.println(hash);
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        countFreqHM(arr);
    }
}
