package LinkedList;

import java.util.Stack;

public class LinkedListMain {
    static class Node{
        int data;
        Node next;
        public Node(){
            data = 0;
            next = null;
        }
        public Node(int data){
            this.data = data;
            next = null;
        }
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    private static Node createLL(int[] arr){
        Node head = new Node();
        Node temp = head;
        for(int data : arr){
            temp.next = new Node(data);
            temp = temp.next;
        }
        return head.next;
    }
    private static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    private static Node insertAtHead(int data,Node head){
        return new Node(data,head);
    }
    private static Node insertAtTail(int data,Node head){
        Node cur = new Node(data);
        if(head==null) return cur;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = cur;
        return head;
    }
    private static Node insertAtPos(int data,Node head,int pos){
        if(pos==1){
            return new Node(data,head);
        }
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = new Node(data,temp.next);
        return head;
    }
    private static Node deleteAtHead(Node head){
        if(head!=null) return head.next;
        return null;
    }
    private static Node deleteAtTail(Node head){
        if(head!=null){
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }
    private static Node deleteAtPos(Node head,int pos){
        if(pos==1) return head.next;
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    private static Node reverse(Node head){
        Stack<Node> stack = new Stack<>();
        while(head!=null){
            Node cur = head;
            head = head.next;
            cur.next = null;
            stack.push(cur);
        }
        head = new Node();
        Node temp = head;
        while(!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;

        }
        return head.next;
    }
    private static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLL(arr);
        display(head);
        head = insertAtHead(0,head);
        display(head);
        head = insertAtTail(6,head);
        display(head);
        head = insertAtPos(10,head,4);
        display(head);
        head = deleteAtHead(head);
        display(head);
        head = deleteAtTail(head);
        display(head);
        head = deleteAtPos(head,3);
        head = reverse(head);
        display(head);
        System.out.println(length(head));
    }
}
