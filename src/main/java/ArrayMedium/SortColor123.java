package ArrayMedium;

public class SortColor123 {
    private static void sortColor(int[] arr){
        int low = 0,mid = 0,high = arr.length-1,t;
        while(mid<=high){
            if(arr[mid]==0){
                t = arr[low];
                arr[low] = arr[mid];
                arr[mid] = t;
                low++;
                mid++;
            }else if(arr[mid]==1) mid++;
            else{
                t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColor(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
