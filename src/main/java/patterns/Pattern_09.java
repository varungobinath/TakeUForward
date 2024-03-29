package patterns;

public class Pattern_09 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *