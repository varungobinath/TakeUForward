package BasicRecursion;

public class Print1toN {
    private static void print(int i,int n){
        if(i==n+1) return ;
        System.out.println(i);
        print(i+1,n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(1,5);
    }
}
