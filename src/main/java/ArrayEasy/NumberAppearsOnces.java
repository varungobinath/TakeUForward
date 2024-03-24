package ArrayEasy;

public class NumberAppearsOnces {
    private static int getSingleElement(int[] arr){
        int xor = 0;
        for(int i : arr){
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(getSingleElement(arr));
    }
}
