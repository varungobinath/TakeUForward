package patterns;

public class pattern16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }
}
//A
//BB
//CCC
//DDDD
//EEEEE