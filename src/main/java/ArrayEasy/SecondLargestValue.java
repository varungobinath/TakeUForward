package ArrayEasy;

public class SecondLargestValue {
    private static int smax(int[] arr){
        int max = arr[0],sma = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                sma = max;
                max = arr[i];
            }else if(sma<arr[i])
                sma = arr[i];
        }
        return sma;
    }
    public static void main(String[] args) {
        int[] arr =  {2,5,1,3,0};
        System.out.println(smax(arr));
    }
}
