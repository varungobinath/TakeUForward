package Graphs.TheLeetcodeOne;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int data;
    public List<Node> neighbors;
    public Node(int data){
        this.data = data;
        neighbors = new ArrayList<>();
    }
}
