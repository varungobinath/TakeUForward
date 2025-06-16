package patterns;

public class pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
//ABCDE
//ABCD
//ABC
//AB
//A