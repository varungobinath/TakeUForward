package Sorting;

public class InsertionSort {
    private static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int j = i;
            while(j>=0 && arr[j+1]<arr[j]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int[] sorted = sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
