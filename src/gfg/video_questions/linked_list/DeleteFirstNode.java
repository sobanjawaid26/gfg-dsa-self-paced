package gfg.video_questions.linked_list;

public class DeleteFirstNode {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;

        // Delete first Node
        Node headNew = deleteFirstNode(head);
        traverseLLRecursive(headNew);
    }

    static Node deleteFirstNode(Node head){
        if(head == null)
            return null;
        return head.next;
    }
    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
