package Sorting;

public class InsertionSortRecur {
    private static void sort(int[] arr,int i){
        int n = arr.length;
        if(i==n-1) return;
        int j=i;
        while(j>=0 && arr[j+1]<arr[j]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            j--;
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
