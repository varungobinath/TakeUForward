package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,7,5,6};
        int n = arr.length;
        for (int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr) System.out.print(i+" ");
    }
}
