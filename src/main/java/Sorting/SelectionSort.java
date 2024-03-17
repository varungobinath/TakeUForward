package Sorting;

public class SelectionSort {
    private static int[] sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
