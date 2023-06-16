package gfg.video_questions.linked_list;

public class InsertBeginning {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;

        // insert 0 at beginning
        Node newHead = insertAtBeginning(head, 0);

        // Recursive Traversal
        traverseLLRecursive(newHead);
    }

    static Node insertAtBeginning(Node head, int value){
        Node newHead = new Node(value);
        newHead.next = head;
        return newHead;
    }
    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
