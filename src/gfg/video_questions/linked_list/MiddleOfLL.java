package gfg.video_questions.linked_list;

public class MiddleOfLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        // Middle of LL
        int mid = middleOfLL(head);
        System.out.println(mid);
    }

    static int middleOfLL(Node head){
        if(head == null)
            return -1;
        if(head.next == null)
            return head.data;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
