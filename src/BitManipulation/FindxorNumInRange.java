package BitManipulation;

public class FindxorNumInRange {
    public static void main(String[] args) {
        int n = 4;
        int ans = -1;//21^2^3^4
        if(n%4==0) ans = 1;
        else if(n%4==2) ans = n+1;
        else if(n%4==3) ans = 0;
        else ans = n;
        System.out.println(ans);

        /*
        * from 4 to 7
        * fun(4-1)^fun(7)*/

    }
}
