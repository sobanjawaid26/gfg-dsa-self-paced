package gfg.video_questions.linked_list;

public class NthNodeFromEndOfLL {

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

        traverseLLRecursive(head);

        // N th node from end
        int val = nthNodeFromEnd(head, 2);
        System.out.println(val);

        // Optimized
        int val2 = nthNodeFromEndOptimized(head, 2);
        System.out.println(val2);
    }

    static int nthNodeFromEndOptimized(Node head, int pos){
        if (head == null){
            return -1;
        }
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < pos; i++){
            if (fast == null)
                return -1;
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    static int nthNodeFromEnd(Node head, int pos){
        int len = 0;
        for (Node curr = head; curr != null; curr = curr.next)
            len++;
        if (len < pos)
            return -1;
        System.out.println(len);
        Node curr = head;
        for (int i = 1; i < len - pos + 1; i++)
            curr = curr.next;
        return curr.data;
    }

    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
