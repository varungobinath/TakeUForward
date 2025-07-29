package Graphs.Practice;

import java.util.*;

class Graphs{
    Map<Integer, List<Integer>> graphs;
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

}

public class GraphsImplementation {
    public static void main(String[] args) {
        Graphs graphs = new Graphs();
        graphs.addEdge(1,2);
        graphs.addEdge(2,3);
        graphs.addEdge(2,4);
        graphs.addEdge(3,5);
        graphs.addEdge(6,7);
        graphs.bfsPrintAll();
    }
}
