package LinkedList.Loop;


class Node{
    int data;
    Node next;
    public Node(){
        data = 0;
        next = null;
    }
    public Node(int data){
        this.data = data;
        next = null;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LoopDetect {
    private static Node createLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    private static Node linkLoop(Node head,int pos){
        int p = 0;
        Node temp = head;
        Node cur = null;
        while(temp.next!=null){
            p++;
            if(p==pos){
                cur = temp;
            }
            temp = temp.next;
        }
        temp.next = cur;
        return head;
    }
    private static boolean isLoop(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return true;
        }
        return false;
    }
    private static Node loopStartsFrom(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) break;
        }
        if(fast==null || fast.next==null) return null;
        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = createLL(arr);
        head = linkLoop(head,3);
        System.out.println(isLoop(head));
        System.out.println(loopStartsFrom(head).data);
    }
}
