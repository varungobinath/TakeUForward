package BasicMaths;

public class HCF {
    private static int hcfOf(int a,int b){
        if (b==0)
            return a;
        return hcfOf(b,a%b);
    }
    private static int gcdOf(int a,int b){
        int ans = 1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0)
                ans = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 4,b = 8;
        System.out.println(hcfOf(a,b));
        System.out.println(gcdOf(a,b));
    }
}
