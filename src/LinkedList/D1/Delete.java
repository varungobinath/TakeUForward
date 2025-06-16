package LinkedList.D1;

public class Delete {
    private static Node create(int[] arr){
        Node head = new Node(0,null);
        Node temp = head;
        for(int i=0;i<arr.length;i++){
            temp.next = new Node(arr[i],null);
            temp = temp.next;
        }
        return head.next;
    }
    private static Node deleteTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = create(arr);
        head = deleteTail(head);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
