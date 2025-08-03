package LinkedList;

public class DeleteMiddleNode {
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
    private static Node deleteMidNode(Node head){
        if(head==null || head.next==null) return null;
        Node fast = head.next.next,slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = createLL(arr);
        head = deleteMidNode(head);
        display(head);
    }
}
