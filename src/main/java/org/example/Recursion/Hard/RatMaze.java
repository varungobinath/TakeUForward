package Recursion.Hard;

import java.util.ArrayList;
import java.util.List;

public class RatMaze {
    private static void backtracking(int[][] m,int r,int c,String l,List<String> ans,boolean[][] visited){
        if(r>=m.length || c>=m.length || r<0 || c<0 || visited[r][c] || m[r][c]==0) return;
        if(r==m.length-1 && c==m[0].length-1){
            ans.add(new String(l));
            return;
        }
        visited[r][c] = true;
        backtracking(m,r-1,c,l+"U",ans,visited);
        backtracking(m,r+1,c,l+"D",ans,visited);
        backtracking(m,r,c-1,l+"L",ans,visited);
        backtracking(m,r,c+1,l+"R",ans,visited);
        visited[r][c] = false;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] m = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        boolean[][] visited = new boolean[n][n];
        List<String> ans = new ArrayList<>();
        backtracking(m,0,0,"",ans,visited);
        System.out.println(ans);
    }
}
