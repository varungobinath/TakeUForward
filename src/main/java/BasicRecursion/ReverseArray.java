package BasicRecursion;

public class ReverseArray {
    private static void reverse(int[] arr){
        int n = arr.length;
        int low = 0,high = n-1;
        while(low<=high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    private static void recursionReverse(int[] arr, int low, int high){
        if(low>=high) return ;
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        recursionReverse(arr,low+1,high-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        reverse(arr);
        recursionReverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
