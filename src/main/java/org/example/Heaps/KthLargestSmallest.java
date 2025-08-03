package Heaps;

import java.util.PriorityQueue;

public class KthLargestSmallest {
    public static int kthSmallest(int[] arr,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : arr) queue.offer(i);
        while(k-->0){
            queue.poll();
        }
        return queue.poll();
    }
    public static int kthLargest(int[] arr,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a);
        for(int i : arr) queue.offer(i);
        while(k-->0){
            queue.poll();
        }
        return queue.poll();
    }
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1,6,7,1,2,3};
        System.out.println(kthLargest(arr,2));
        System.out.println(kthSmallest(arr,2));
    }
}
