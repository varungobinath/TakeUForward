package Graphs.TwoDimension;

public class GraphsImpArray {
    private static int[][] createGraphs(int vertices){
        return new int[vertices][vertices];
    }
    private static void addEdges(int[][] graphs,int a,int b){
        graphs[a][b] = 1;
        graphs[b][a] = 1;
    }
    public static void main(String[] args) {
        int[][] graphs = createGraphs(3);
    }
}
