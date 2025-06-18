package LinkedList;

import java.util.HashSet;

public class IntersectionNode {
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
    private static Node insersectionNode(Node head1,Node head2){
        HashSet<Node> set = new HashSet<>();
        while(head1!=null){
            set.add(head1);
            head1 = head1.next;
        }
        while(head2!=null){
            if(set.contains(head2)){
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Node head = createLL(new int[]{1,3,1,2,4});
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = new Node(3);
        Node head2 = headSec;
        headSec.next = head;
        display(head1);
        display(head2);
        System.out.println(insersectionNode(head1,head2).data);
    }
}
/*
* 1 -> 3 -> 1 --
*              |--->2 -> 4
*           3 --
* */