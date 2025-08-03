package BasicMaths;

public class GCDorHCF {
    private static int HCF(int a,int b){
        for(int i=Math.min(a,b);i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int a = 20,b = 15;
        System.out.println(HCF(a,b));
    }
}
