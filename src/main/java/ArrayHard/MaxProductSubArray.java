package ArrayHard;

public class MaxProductSubArray {
    private static int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE,n = nums.length;
        if(n==1) return nums[0];
        int product1 = 1,product2=1;
        for(int i=0;i<n;i++){
            product1*=nums[i];
            product2*=nums[n-i-1];
            maxi = Math.max(maxi,product1);
            maxi = Math.max(maxi,product2);
            if(product1==0) product1 = 1;
            if(product2==0) product2 = 1;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        System.out.println(maxProduct(arr));
    }
}
