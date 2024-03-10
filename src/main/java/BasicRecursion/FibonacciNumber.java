package BasicRecursion;

public class FibonacciNumber {
    private static int fibo(int n){
        if (n == 0 || n == 1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    private static void fibo1(int n){
        if(n==0) System.out.print(0);
        else{
            int first = 0;
            int second = 1;
            System.out.print(0+" "+1+" ");
            for(int i=2;i<=n;i++){
                int cur = first + second;
                first = second;
                second = cur;
                System.out.print(cur+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibo(n));
        fibo1(n);
    }
}