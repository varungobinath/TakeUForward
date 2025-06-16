package GreedyAlgorithm.Easy;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        int five = 0, ten = 0;
        for(int i : bills){
            if(i==5) five++;
            else if(i==10){
                if(five>0){
                    ten++;
                    five--;
                }else{
                    System.out.println(false);
                    return;
                }
            }else if(i==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>2){
                    five-=3;
                }else{
                    System.out.println(false);
                    return;
                }
            }else{
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
