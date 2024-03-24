package ArrayEasy;

public class MaxSubarrayOfTarget {
    private static int MaxSubarrayofk(int[] arr,int k){
        int n = arr.length;
        int max = 0;
        for(int i=0;i<n;i++){
            int s = 0;
            for(int j=i;j<n;j++){
                s += arr[j];
                if(s==k)
                    max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        System.out.println(MaxSubarrayofk(a,k));
    }
}
