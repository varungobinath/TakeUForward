package LinkedList.D1;

public class Search {
    private static Node create(int[] arr){
        Node head = new Node(0,null);
        Node temp = head;
        for(int i=0;i<arr.length;i++){
            temp.next = new Node(arr[i],null);
            temp = temp.next;
        }
        return head.next;
    }
    private static int index(Node head,int searchData){
        int index = -1;
        while(head!=null){
            index++;
            if(head.data==searchData) return index;
            head = head.next;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = create(arr);
        System.out.println(index(head,3));
    }
}
