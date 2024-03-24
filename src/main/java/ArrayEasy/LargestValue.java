package ArrayEasy;

public class LargestValue {
    private static int max(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr =  {2,5,1,3,0};
        System.out.println(max(arr));
    }
}
