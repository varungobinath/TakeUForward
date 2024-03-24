package ArrayEasy;

public class MissingNumber {
    private static int missingNumber(int[] nums){
        int n = nums.length;
        int soa = 0;
        for(int i : nums)
            soa += i;
        int sum = (n*(n+1))/2;
        return sum-soa;
    }
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 4};
        System.out.println(missingNumber(a));
    }
}
