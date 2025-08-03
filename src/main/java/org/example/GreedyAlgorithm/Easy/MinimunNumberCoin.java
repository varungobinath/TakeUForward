package GreedyAlgorithm.Easy;

import java.util.ArrayList;

public class MinimunNumberCoin {
    public static void main(String[] args) {
        int value = 1221;
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=8;i>=0;i--){
            while(value>=coins[i]){
                value-=coins[i];
                ans.add(coins[i]);
            }
        }
        System.out.println(ans);
    }
}
