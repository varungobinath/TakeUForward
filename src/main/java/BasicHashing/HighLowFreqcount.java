package BasicHashing;

import java.util.HashMap;

public class HighLowFreqcount {
    private static void highlowFreq(int[] arr){
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int maxkey=0,maxfreq = Integer.MIN_VALUE;
        int minkey=0,minfreq = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(visited[i])
                continue;
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count>maxfreq){
                maxfreq = count;
                maxkey = arr[i];
            }
            if(count<minfreq){
                minfreq = count;
                minkey = arr[i];
            }
        }
        System.out.println(maxkey+" "+minkey);
    }
    private static void highlowfreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        int maxkey=0,minkey=0;
        int maxfreq=Integer.MIN_VALUE,minfreq=Integer.MAX_VALUE;
        for(int i : map.keySet()){
            if(map.get(i)>maxfreq){
                maxkey=i;
                maxfreq=map.get(i);
            }
            if(map.get(i)<minfreq){
                minkey=i;
                minfreq=map.get(i);
            }
        }
        System.out.println(maxkey+" "+minkey);
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        highlowFreq(arr);
        highlowfreq(arr);
    }
}
