package BinarySearch1D;

public class LowerAndUpperBound {
    private static int lowerBound(int[] arr,int x){//searchInsertposition
        int low = 0,high = arr.length-1;
        int ans = high+1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private static int higherBound(int[] arr,int x){
        int low = 0,high = arr.length-1;
        int ans = high+1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(lowerBound(arr,x));

    }
}
