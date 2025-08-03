package BitManipulation;

public class MinFlipsToConvertNum {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        int count = 0;
        int ans = start^goal;
//        while(ans!=0){
//            if((ans&1)==1) count++;
//            ans>>=1;
//        }
        for(int i=0;i<=31;i++){
            if((ans&(1<<i))!=0) count++;
        }
        System.out.println(count);
    }
}
