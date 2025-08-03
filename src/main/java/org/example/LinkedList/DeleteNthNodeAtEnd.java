package LinkedList;

public class DeleteNthNodeAtEnd {
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
    private static Node deleteAtEnd(Node head,int n){
        Node fast = head, slow = head;
        for(int i=0;i<n;i++) fast = fast.next;
        if(fast==null) return head.next;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = 4;
        Node head = createLL(arr);
        head = deleteAtEnd(head,n);
        display(head);
    }
}
