package BasicMaths;

public class ArmstrongNumber {
    private static boolean isArmstrongnumber(int n){
        int temp = n,sum = 0;
        int digits = (int) Math.floor(Math.log10(n)+1);
        while(temp!=0){
            int r = temp%10;
            sum += Math.pow(r,digits);
            temp /= 10;
        }
        System.out.println(sum+" "+n);
        return (boolean) (n == sum);
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrongnumber(n));
    }
}
