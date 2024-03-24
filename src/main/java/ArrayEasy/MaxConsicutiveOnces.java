package ArrayEasy;

public class MaxConsicutiveOnces {
    private static int maxConsicutiveOnces(int[] arr){
        int max = 0;
        int count = 0;
        int flag = 0;
        for(int i : arr){
            if(i==1){
                flag = 1;
                count++;
            }else{
                flag = 0;
                max = Math.max(max,count);
                count = 0;
            }
        }
        if(flag==1)
            max = Math.max(max,count);
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println(maxConsicutiveOnces(arr));
    }
}
