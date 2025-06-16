package LinkedList.D2;

class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data,Node prev,Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class Intro {
    public static Node createLLD(int[] arr){
        Node head = new Node(arr[0],null,null);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
             Node temp = new Node(arr[i],prev,null);
//             temp.prev = prev;
             prev.next = temp;
             prev = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLLD(arr);
        while(head.next!=null){
            System.out.println(head.data);
            head = head.next;
        }
        while(head!=null){
            System.out.println(head.data);
            head = head.prev;
        }
    }
}
