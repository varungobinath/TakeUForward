package BinarySearch1D;

public class BinarySearch {
    private static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0,high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<target)
                low = mid+1;
            else if(nums[mid]>target)
                high = mid-1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] nums = {-1,0,3,5,9,12};
       int target = 9;
        System.out.println(search(nums,target));
    }
}
