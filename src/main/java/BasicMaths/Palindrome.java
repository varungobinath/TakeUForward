package BasicMaths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        int rn = 0;
        int temp = n;
        while(temp!=0){
            int r = temp % 10;
            rn = rn*10+r;
            temp = temp / 10;
        }
        System.out.println(n==rn?"is palindrome":"not palindrome");
    }
}
