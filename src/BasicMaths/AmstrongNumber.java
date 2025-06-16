package BasicMaths;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int digit = String.valueOf(num).length();
        int sum = 0;
        while(temp!=0){
            sum += Math.pow(temp%10,digit);
            temp/=10;
        }
        System.out.println(num==sum);
    }
}
