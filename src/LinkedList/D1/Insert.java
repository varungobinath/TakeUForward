package LinkedList.D1;

//public class Node{
//    int data;
//    Node next;
//    public Node(int data,Node next){
//        this.data = data;
//        this.next = next;
//    }
//}

public class Insert {
    private static Node create(int[] arr){
        Node head = new Node(0,null);
        Node temp = head;
        for(int i=0;i<arr.length;i++){
            temp.next = new Node(arr[i],null);
            temp = temp.next;
        }
        return head.next;
    }
    private static Node insert(Node head,int data){
        Node temp = new Node(data,head);
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = create(arr);
        head = insert(head,9);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
