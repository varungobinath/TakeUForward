package Graphs.Practice;

import java.util.*;

class Graphs{
    private Map<Integer, List<Integer>> graphs;
    public Graphs(){
        graphs = new HashMap<>();
    }
    public void addEdge(int u,int v){
        if(!graphs.containsKey(u)){
            graphs.put(u,new ArrayList<>());
        }
        if(!graphs.containsKey(v)){
            graphs.put(v,new ArrayList<>());
        }
        graphs.get(u).add(v);
        graphs.get(v).add(u);
    }
    public void bfsPrint(int start){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node);
            for(int n : graphs.get(node)){
                if(!visited.contains(n)) {
                    queue.add(n);
                    visited.add(n);
                }
            }
        }
    }
    public void bfsPrintAll(){
        Set<Integer> visited = new HashSet<>();
        for(Integer start : graphs.keySet()){
            if(!visited.contains(start)){
                Queue<Integer> queue = new LinkedList<>();
                queue.add(start);
                visited.add(start);
                while(!queue.isEmpty()){
                    int node = queue.poll();
                    System.out.println(node);
                    for(int n : graphs.get(node)){
                        if(!visited.contains(n)) {
                            queue.add(n);
                            visited.add(n);
                        }
                    }
                }
            }
        }
    }
    private void dfsprint(int start,Set<Integer> visited){
        System.out.println(start);
        visited.add(start);
        for(Integer n : graphs.get(start)){
            if(!visited.contains(n))
                dfsprint(n,visited);
        }
    }
    public void dfsPrint(int start){
        dfsprint(start,new HashSet<>());
    }
    public int noOfGraphs(){
        int count = 0;
        Set<Integer> visited = new HashSet<>();
        for(Integer start : graphs.keySet()){
            if(!visited.contains(start)){
                dfs(start,visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(int start,Set<Integer> visited){
        for(int n : graphs.get(start)){
            if(!visited.contains(n)){
                visited.add(n);
                dfs(n,visited);
            }
        }
    }

}

public class GraphsImplementation {
    public static void main(String[] args) {
        Graphs graphs = new Graphs();
        graphs.addEdge(1,2);
        graphs.addEdge(2,3);
        graphs.addEdge(2,4);
        graphs.addEdge(3,5);
        graphs.addEdge(6,7);
        graphs.addEdge(8,9);
//        graphs.bfsPrintAll();
//        System.out.println(graphs.noOfGraphs());
        graphs.dfsPrint(1);
    }
}
