package gfg.video_questions.linked_list;

public class InsertAtEnd {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;

        // insert at end
        insertAtEnd(head, 40);
        insertAtEnd(head, 50);
        insertAtEnd(head, 60);

        traverseLLRecursive(head);
    }

    static Node insertAtEnd(Node head, int val){
        Node newNode = new Node(val);
        if(head == null)
            return newNode;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }
    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
