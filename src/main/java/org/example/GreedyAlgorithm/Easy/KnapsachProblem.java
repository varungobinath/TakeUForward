package GreedyAlgorithm.Easy;

import java.util.Arrays;

public class KnapsachProblem {
    static class Item{
        int value;
        int weight;
        Item(int v,int w){
            value = v;
            weight = w;
        }
    }
    public static void main(String[] args) {
        int w = 50;
        int[] values = {100,60,120}, weight = {20,10,30};
        int n = values.length;
        Item[] arr = new Item[n];
        for(int i=0;i<n;i++){
            arr[i] = new Item(values[i],weight[i]);
        }
        Arrays.sort(arr,(a,b)->{
            double x = a.value/(double)a.weight;
            double y = b.value/(double)b.weight;
            if(x<y) return 1;
            else if(x>y) return -1;
            else return 0;
        });//desc based on values of 1 weight (value per weight)
        int total_value = 0;
        for(int i=0;i<n;i++){
            if(arr[i].weight<=w){
                total_value += arr[i].value;
                w = w-arr[i].weight;
            }else{
                double per_weight = (arr[i].value/arr[i].weight);
                double remaning_value = per_weight*w;
                total_value+=remaning_value;
                break;
            }
        }
        System.out.println(total_value);
    }
    public static int knapsack(int[] weights, int[] values, int capacity, int n, Integer[][] dp) {
        // Base case
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // If already computed
        if (dp[n][capacity] != null) {
            return dp[n][capacity];
        }

        // First, don't take the item
        int notTake = knapsack(weights, values, capacity, n - 1, dp);

        // Second, take only if weight fits
        int take = Integer.MIN_VALUE;
        if (weights[n - 1] <= capacity) {
            take = values[n - 1] + knapsack(weights, values, capacity - weights[n - 1], n - 1, dp);
        }

        // Store and return the max of both choices
        dp[n][capacity] = Math.max(take, notTake);
        return dp[n][capacity];
        //knapsack(weights, values, capacity, n, dp))
    }

}
