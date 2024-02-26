package BasicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 1234567;
        int digits = (int)Math.floor(Math.log10(n)+1);
        System.out.println(digits);
    }
}
