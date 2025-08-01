package Graphs.TwoDimension;

import java.util.LinkedList;
import java.util.Queue;

class Graphs{
    int[][] graphs;
    Graphs(int vertices){
        graphs = new int[vertices][vertices];
    }
    public void addEdge(int a,int b){
        graphs[a][b] = 1;
        graphs[b][a] = 1;
    }
    public void removeEdges(int a,int b){
        graphs[a][b] = 0;
        graphs[b][a] = 0;
    }
    public void bfsPrint(int start){
        boolean[] visited = new boolean[graphs.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node);
            for(int i=0;i<graphs.length;i++){
                if(graphs[node][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
    public void bfsPrintAll(){
        boolean[] visited = new boolean[graphs.length];
        for(int start = 0; start <graphs.length; start++){
            if(!visited[start]){
                Queue<Integer> queue = new LinkedList<>();
                visited[start] = true;
                queue.offer(start);
                while (!queue.isEmpty()){
                    int node = queue.poll();
                    System.out.println(node);
                    for(int i=0;i<graphs.length;i++){
                        if(graphs[node][i]==1 && !visited[i]){
                            visited[i] = true;
                            queue.offer(i);
                        }
                    }
                }
            }
        }
    }
    private void dfs(int start,boolean[] visited){
        visited[start] = true;
        for(int i=0;i<graphs.length;i++){
            if(graphs[start][i]==1 && !visited[i]){
                dfs(i,visited);
            }
        }
    }
    public int noOfGraphs(){
        int count = 0;
        boolean[] visited = new boolean[graphs.length];
        for(int i=0;i<graphs.length;i++){
            if(!visited[i] && hasEdge(i)){
                dfs(i,visited);
                count++;
            }
        }
        return count;
    }
    public boolean hasEdge(int node){
        for(int i=0;i<graphs.length;i++){
            if(graphs[node][i]==1) return true;
        }
        return false;
    }
}

public class GraphsImpArray {
    public static void main(String[] args) {
        Graphs graphs = new Graphs(10);
        graphs.addEdge(1,2);
        graphs.addEdge(2,3);
        graphs.addEdge(2,4);
        graphs.addEdge(3,5);
        graphs.addEdge(6,7);
        graphs.addEdge(8,9);
//        graphs.bfsPrintAll();
        System.out.println(graphs.noOfGraphs());
    }
}
