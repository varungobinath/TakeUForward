package patterns;

public class pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+n-j-1)+" ");
            }
            System.out.println();
        }
    }
}
//E
//E D
//E D C
//E D C B
//E D C B A