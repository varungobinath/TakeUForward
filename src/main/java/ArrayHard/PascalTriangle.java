package ArrayHard;

import java.util.ArrayList;

public class PascalTriangle {
    public static int nCr(int n,int r){
        int result = 1;
        for(int i=0;i<r;i++){
            result *= (n-i);
            result /= (i+1);
        }
        return result;
    }
    public static ArrayList<Integer> rowOf(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=1;i<=n;i++){
            lst.add(nCr(n-1,i-1));
        }
        return lst;
    }
    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            lst.add(rowOf(i));
        }
        return lst;
    }

    public static void main(String[] args) {
        int n = 5;
        for(ArrayList<Integer> i : generate(5)){
            System.out.println(i);
        }
    }
}
