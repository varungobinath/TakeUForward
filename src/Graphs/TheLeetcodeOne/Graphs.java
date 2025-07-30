package Graphs.TheLeetcodeOne;

import java.util.*;

class Node {
    public int data;
    public List<Node> neighbors;
    public Node(int data){
        this.data = data;
        neighbors = new ArrayList<>();
    }
}
public class Graphs {
    List<Node> nodes;
    public Graphs(){
        nodes = new ArrayList<>();
    }
    private Node getNode(int data){
        for(Node node : nodes){
            if(node.data==data) return node;
        }
        return null;
    }
    public void addEdge(int a,int b){
        Node u = getNode(a);
        Node v = getNode(b);
        if(u==null){
            u = new Node(a);
            nodes.add(u);
        }
        if(v==null){
            v = new Node(b);
            nodes.add(v);
        }
        u.neighbors.add(v);
        v.neighbors.add(u);
    }
    private void bfsprint(Node start){
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur.data);
            for(Node neighbor : cur.neighbors){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
    public void bfsPrint(int start){
        Node node = getNode(start);
        if(node!=null){
            bfsprint(node);
        }
    }
    private void dfs(Node start,Set<Node> visited){
        visited.add(start);
        for(Node neighbor : start.neighbors){
            if(!visited.contains(neighbor))
                dfs(neighbor,visited);
        }
    }
    public int noOfGraphs(){
        int count = 0;
        Set<Node> visited = new HashSet<>();
        for(Node node : nodes){
            if(!visited.contains(node)){
                dfs(node,visited);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Graphs graphs = new Graphs();
        graphs.addEdge(1,2);
        graphs.addEdge(2,3);
        graphs.addEdge(2,4);
        graphs.addEdge(3,5);
        graphs.addEdge(6,7);
        graphs.addEdge(8,9);
//        graphs.bfsPrint(1);
        System.out.println(graphs.noOfGraphs());
    }
}
