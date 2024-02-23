package patterns;

public class Pattern_17 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(" ");;
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+j-1));
            }
            for(int j=i-1;j>0;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}
//   A
//  ABA
// ABCBA
//ABCDCBA