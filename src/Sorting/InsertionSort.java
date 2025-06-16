package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,7,5,6};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i : arr) System.out.print(i+" ");
    }
}
