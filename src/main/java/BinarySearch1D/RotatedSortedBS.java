package BinarySearch1D;

public class RotatedSortedBS {
    private static int searchInRS(int[] num, int k){
        int low = 0;
        int high = num.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(num[mid]==k) return mid;

            //if left part is sorted
            if(num[low]<=num[mid]){
                if(num[low]<=k && k<=num[mid]) high = mid-1;
                else low = mid+1;
            }else{
                if(num[mid]<=k && k<=num[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
    private static boolean searchInDRS(int[] num,int k){
        int low = 0;
        int high = num.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(num[mid]==k) return true;
            //edge case:
            if(num[low]==num[mid] && num[mid] == num[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }
            //if left part is sorted
            if(num[low]<=num[mid]){
                if(num[low]<=k && k<=num[mid]) high = mid-1;
                else low = mid+1;
            }else{//right part is sorted
                if(num[mid]<=k && k<=num[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        int element = 6;
        System.out.println(searchInRS(arr,element));
    }
}
