package LinkedList;

public class OddEvenLinkedList {
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
    private static Node oddEvenList(Node head){
        if(head==null) return null;
        Node odd = head, even = head.next, evenhead = head.next;
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = createLL(arr);
        head = oddEvenList(head);
        display(head);
    }
}
