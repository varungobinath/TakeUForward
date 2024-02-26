package BasicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456;
        int rn = 0;
        while(n!=0){
            int r = n%10;
            rn = rn * 10 + r;
            n = n / 10;
        }
        System.out.println(rn);
    }

}
