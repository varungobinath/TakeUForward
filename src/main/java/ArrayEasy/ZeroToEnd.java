package ArrayEasy;

public class ZeroToEnd {
    private static void moveZeroToEnd(int[] arr){
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            int j = i;
            while(j!=n-1 && arr[j]==0 && arr[j+1]!=0){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j++;
            }
        }
    }
    private static void moveZero(int[] arr){
        int i=0;
        for(int ele : arr){
            if(ele != 0)
                arr[i++] = ele;
        }
        while(i<arr.length){
            arr[i++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveZero(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
