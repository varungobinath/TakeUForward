package BasicMaths;

public class PrimeNumber {
    private static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
}
