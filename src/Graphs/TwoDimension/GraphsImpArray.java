package Graphs.TwoDimension;

public class GraphsImpArray {
    private static int[][] createGraphs(int vertices){
        return new int[vertices][vertices];
    }
    public static void main(String[] args) {
        int[][] graphs = createGraphs(3);
    }
}
