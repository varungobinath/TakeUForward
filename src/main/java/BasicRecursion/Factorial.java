package BasicRecursion;

public class Factorial {
    private static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        int fact = factorial(n);
        System.out.println(fact);
    }
}
