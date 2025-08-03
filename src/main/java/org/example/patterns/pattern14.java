package patterns;

public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
//A
//AB
//ABC
//ABCD
//ABCDE