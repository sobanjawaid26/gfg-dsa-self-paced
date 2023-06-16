package gfg.video_questions.linked_list;

public class InsertAtPosition {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        traverseLLRecursive(head);
        System.out.println();

        // Insert at position
        Node newHead = insertAtPositionOptimized( head,2, 25);

        traverseLLRecursive(newHead);
    }

    static Node insertAtPositionOptimized(Node head, int pos, int val) {

        Node temp = new Node(val);
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 0; i<= pos - 2 && curr != null; i++)
            curr = curr.next;
        if(curr == null)
            return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    static Node insertAtPosition(Node head, int pos, int val) {
        Node temp = head;
        int counter = 1;
        while(temp.next != null){
            if(counter == pos){
                Node newNode = new Node(val);
                Node t = temp.next;
                temp.next = newNode;
                newNode.next = t;
            }
            else
                temp = temp.next;
            counter++;
        }
        return head;
    }
        static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
