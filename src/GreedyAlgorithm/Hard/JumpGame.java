package GreedyAlgorithm.Hard;

public class JumpGame {
    public static void main(String[] args) {
//        int[] arr = {2,3,1,0,4}; //can reach
//        int[] arr = {3,2,1,0,4}; // can't reach
        int[] arr = {1,2,3,1,1,0,2,5};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(i>max){
                System.out.println(false);
                return;
            }
            max = Math.max(max,i+arr[i]);
        }
        System.out.println(true);

    }
}
