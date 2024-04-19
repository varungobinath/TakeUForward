package ArrayMedium;

public class StockBuyAndSell {
    private static int maxProfit(int[] nums){
        int maxProfit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(minprice>nums[i]) minprice = nums[i];
            maxProfit = Math.max(maxProfit,nums[i]-minprice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println(maxPro);
    }
}
