package Sorting;

public class BubbleSortRecur {
    private static void sort(int[] arr,int i){
        int n = arr.length;
        if(i==n-1) return;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        sort(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        sort(arr,0);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
