package LinkedList;

public class MiddleElement {
    private static Node createLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    private static Node middleNode(Node head){
        if(head==null || head.next==null) return head;
        Node fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Node head = createLL(arr);
        System.out.println(middleNode(head).data);
    }
}
