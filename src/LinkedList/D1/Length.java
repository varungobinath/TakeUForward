package LinkedList.D1;

public class Length {
    private static Node create(int[] arr){
        Node head = new Node(0,null);
        Node temp = head;
        for(int i=0;i<arr.length;i++){
            temp.next = new Node(arr[i],null);
            temp = temp.next;
        }
        return head.next;
    }
    private static int length(Node head){
        int len = 0;
        while(head!=null){
            head = head.next;
            len++;
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = create(arr);
        System.out.println(length(head));
    }
}
