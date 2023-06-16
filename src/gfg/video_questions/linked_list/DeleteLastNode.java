package gfg.video_questions.linked_list;

public class DeleteLastNode {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        traverseLLRecursive(head);

        //Delete last node
        Node newHead = deleteLastNode(head);

        traverseLLRecursive(newHead);
    }

    static Node deleteLastNode(Node head){
        if(head ==  null)
            return null;
        if (head.next == null)
            return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
