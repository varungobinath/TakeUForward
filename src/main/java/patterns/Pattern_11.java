package patterns;

public class Pattern_11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if((i+j)%2==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
//1
//01
//101
//0101
//10101