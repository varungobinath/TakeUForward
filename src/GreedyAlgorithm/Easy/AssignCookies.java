package GreedyAlgorithm.Easy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2}, s = {1,2,3};
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        for(int j=0;j<s.length;j++){
            if(i<g.length && g[i]<s[j]) i++;
        }
        System.out.println("Number of children are satisfied "+ i);
    }
}
