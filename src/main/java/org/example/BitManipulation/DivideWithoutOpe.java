package BitManipulation;

public class DivideWithoutOpe {
    public static void main(String[] args) {
        int a = 22;
        int b = 3;
        if(a==b){
            System.out.println(1);
            return;
        }
        int ans = 0;
        boolean sign = true;//+ve
        if(a>=0 && b<0) sign = false;
        if(a<0 && b>0) sign = false;
        a = Math.abs(a);
        b = Math.abs(b);
        while(a>=b){
            int count = 0;
            while(a>=(b<<(count+1))) count++;
            ans += (1<<count);
            a = a-(b*(1<<count));
        }
        System.out.println(sign?ans:-1*ans);
    }
}
