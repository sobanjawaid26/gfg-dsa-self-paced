package gfg.video_questions.linked_list;

public class RemoveDuplFromSortedLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(30);
        Node temp4 = new Node(50);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        traverseLLRecursive(head);
        System.out.println();

        Node newNode = removeDuplicateFromSortedLL(head);
        traverseLLRecursive(newNode);
    }


    static Node removeDuplicateFromSortedLL(Node head){
        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
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
