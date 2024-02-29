package BasicRecursion;

public class PrintNameNtimes {
    private static void print(int i,int n){
        if(i==n) return ;
        System.out.println("Hello world");
        print(i+1,n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(0,n);
    }
}
