package gfg.amazon_test_series.linked_list;

public class DeleteMiddleOfLL {

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

        Node newHead = deleteMiddleOfLL(head);
        traverseLLRecursive(newHead);
    }

    static Node deleteMiddleOfLL(Node head){
        if(head == null)
            return null;
        if(head.next == null)
            return null;
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    }

    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
