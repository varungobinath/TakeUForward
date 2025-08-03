package LinkedList.D1;

class Node{
    int data;
    Node next;
    public Node(){
        this.data = 0;
        this.next = null;
    }
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Intro {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<5;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
