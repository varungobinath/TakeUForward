package Graphs.HashMap;

import java.util.*;

class Graphs<T>{
    private Map<T, List<T>> graphs;
    public Graphs(){
        graphs = new HashMap<>();
    }
    public void addEdge(T u,T v){
        if(!graphs.containsKey(u)){
            graphs.put(u,new ArrayList<>());
        }
        if(!graphs.containsKey(v)){
            graphs.put(v,new ArrayList<>());
        }
        graphs.get(u).add(v);
        graphs.get(v).add(u);
    }
    public void addVertex(T a){
        graphs.put(a,new ArrayList<>());
    }
    public void removeVertex(T node){
        List<T> neighbors = graphs.get(node);
        for(T n : neighbors){
            graphs.get(n).remove(node);
        }
        graphs.remove(node);
    }
    public void removeEdge(T u, T v){
        if(graphs.containsKey(u)){
            graphs.get(u).remove(v);
        }
        if(graphs.containsKey(v)){
            graphs.get(v).remove(u);
        }
    }
    public void bfsPrint(T start){
        if(!graphs.containsKey(start)){
            System.out.println("No vertices as start");
            return;
        }
        Queue<T> queue = new LinkedList<>();
        Set<T> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()){
            T node = queue.poll();
            System.out.println(node);
            for(T n : graphs.get(node)){
                if(!visited.contains(n)) {
                    queue.add(n);
                    visited.add(n);
                }
            }
        }
    }
    public void bfsPrintAll(){
        Set<T> visited = new HashSet<>();
        for(T start : graphs.keySet()){
            if(!visited.contains(start)){
                Queue<T> queue = new LinkedList<>();
                queue.add(start);
                visited.add(start);
                while(!queue.isEmpty()){
                    T node = queue.poll();
                    System.out.println(node);
                    for(T n : graphs.get(node)){
                        if(!visited.contains(n)) {
                            queue.add(n);
                            visited.add(n);
                        }
                    }
                }
            }
        }
    }
    private void dfsprint(T start,Set<T> visited){
        System.out.println(start);
        visited.add(start);
        for(T n : graphs.get(start)){
            if(!visited.contains(n))
                dfsprint(n,visited);
        }
    }
    public void dfsPrint(T start){
        dfsprint(start,new HashSet<>());
    }
    public int noOfGraphs(){
        int count = 0;
        Set<T> visited = new HashSet<>();
        for(T start : graphs.keySet()){
            if(!visited.contains(start)){
                bfs(start,visited);
//                dfs(start,visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(T start,Set<T> visited){
        for(T n : graphs.get(start)){
            if(!visited.contains(n)){
                visited.add(n);
                dfs(n,visited);
            }
        }
    }
    public void bfs(T start,Set<T> visited){
        Queue<T> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()){
            T node = queue.poll();
            for(T n : graphs.get(node)){
                if(!visited.contains(n)){
                    queue.offer(n);
                    visited.add(n);
                }
            }
        }
    }
    public void printGraphs(){
        for(T node : graphs.keySet()){
            System.out.println(node+" : "+graphs.get(node));
        }
    }

}

public class GraphsImplementation {
    public static void main(String[] args) {
        Graphs<Integer> graphs = new Graphs<>();
        graphs.addEdge(1,2);
        graphs.addEdge(2,3);
        graphs.addEdge(2,4);
        graphs.addEdge(3,5);
        graphs.addEdge(6,7);
        graphs.addEdge(8,9);
        graphs.addVertex(10);
        graphs.bfsPrintAll();
//        System.out.println(graphs.noOfGraphs());
//        graphs.dfsPrint(1);
//        graphs.printGraphs();
//        System.out.println();
//        graphs.removeEdge(8,9);
//        graphs.removeVertex(1);
        graphs.printGraphs();

    }
}
