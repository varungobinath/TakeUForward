package LinkedList.D2;

public class Delete {
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
    public static Node deleteTail(Node head){
        if(head==null || head.next==null) return null;
        Node tail = head;
        while(tail.next.next!=null){
            tail = tail.next;
        }
        Node tail2 = tail.next;
        tail.next = null;
        tail2.prev = null;
        return head;
    }
    public static Node deleteHead(Node head){
        if(head==null || head.next==null) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLLD(arr);
        head = deleteTail(head);
        head = deleteHead(head);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
