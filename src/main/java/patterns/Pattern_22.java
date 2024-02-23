package patterns;

public class Pattern_22 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int bottom = 2*n-2-i;
                int right = 2*n-2-j;
                int x = (top<bottom)?top:bottom;
                int y = (left<right)?left:right;
                int ans = (x<y)?x:y;
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
