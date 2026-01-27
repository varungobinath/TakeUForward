package org.example.Graphs;
import java.util.*;

public class TheMysteryoftheHauntedGrid {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        int[][] board = {
                {2147483647, -1, 0, 2147483647},
                {2147483647, 2147483647, 2147483647, -1},
                {2147483647, -1, 2147483647, -1},
                {0, -1, 2147483647, 2147483647}
        };

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        // Add all gates to the queue
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    visited.add(i+","+j);
                }
            }
        }

        int count = 0;
        int[] pr = {-1, 0, 0, 1};
        int[] pc = {0, -1, 1, 0};

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[] pos = queue.poll();
                board[pos[0]][pos[1]] = count;
                for(int idx=0; idx<4; idx++){
                    int nr = pos[0] + pr[idx];
                    int nc = pos[1] + pc[idx];
                    String key = nr + "," + nc;
                    if(nr >= 0 && nc >= 0 && nr < row && nc < col && board[nr][nc] != -1 && !visited.contains(key)){
                        queue.offer(new int[]{nr, nc});
                        visited.add(key);
                    }
                }
            }
            count++;
        }

        for(int[] i : board){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
