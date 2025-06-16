package LinkedList.D2;

public class Insert {
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
    public static Node insertAtTail(int data,Node head){
        Node cur = new Node(data,null,null);
        if(head==null) return cur;
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = cur;
        cur.prev = temp;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLLD(arr);
        head = insertAtTail(6,head);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
