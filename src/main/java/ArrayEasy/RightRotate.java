package ArrayEasy;

public class RightRotate {
    private static void rightRotate(int[] arr,int k){
        int n = arr.length;
        k =  k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    private static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        int n = arr.length;
        rightRotate(arr,k);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
