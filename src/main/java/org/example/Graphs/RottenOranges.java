package org.example.Graphs;

import java.util.*;

public class RottenOranges {
    static int[] pr = {-1,0,0,1};
    static int[] pc = {0,-1,1,0};
    private static int orangesRotting(int[][] grid){
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int minutes = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean rottedThisMin = false;
            for(int i=0;i<size;i++){
                int[] position = queue.poll();
                int cr = position[0];
                int cc = position[1];
                for(int d = 0; d <4; d++){
                    int nr = cr+pr[d];
                    int nc = cc+pc[d];
                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
                        grid[nr][nc] = 2;
                        queue.offer(new int[]{nr,nc});
                        fresh--;
                        rottedThisMin = true;
                    }
                }
            }
            if(rottedThisMin) minutes++;
        }
        return fresh==0?minutes:-1;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };//4
        System.out.println(orangesRotting(grid));
        for(int[] i : grid){
            System.out.println(Arrays.toString(i));
        }
    }
}
