package BasicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 34523;
        int digit = (int) (Math.log10(n)+1);
        System.out.println(digit);
    }
}
/*
Output:
5
 */