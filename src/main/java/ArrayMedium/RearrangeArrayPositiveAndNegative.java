package ArrayMedium;

public class RearrangeArrayPositiveAndNegative {
    private static int[] rearrangeArray(int[] nums){
        int pos = 0,neg = 1;
        int[] arr = new int[nums.length];
        for(int i : nums){
            if(i>0){
                arr[pos] = i;
                pos+=2;
            }else if(i<0){
                arr[neg] = i;
                neg+=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums= {1,2,-4,-5};
        int[] ans = rearrangeArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
