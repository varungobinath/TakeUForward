package LinkedList.D2;

public class Reverse {
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
    public static Node reverse(Node head){
        Node prev = null;
        Node cur = head;
        while(cur!=null){
            prev = cur.prev;
            cur.prev = cur.next;
            cur.next = prev;

            cur = cur.prev;
        }
        return prev.prev;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLLD(arr);
        head = reverse(head);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}

