package LinkedList;


import java.util.Stack;

public class ReverseLL {
    private static Node createLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    private static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    private static Node reverseLL(Node head){
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    private static Node reverseUsingStack(Node head){
        Node temp = head;
        Stack<Node> stack = new Stack<>();
        while(head!=null){
            head = head.next;
            temp.next = null;
            stack.push(temp);
            temp = head;
        }
        head = stack.pop();
        temp = head;
        while(!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLL(arr);
        head = reverseUsingStack(head);
        display(head);
    }
}
