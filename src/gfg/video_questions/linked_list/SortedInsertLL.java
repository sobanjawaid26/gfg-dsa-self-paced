package gfg.video_questions.linked_list;

public class SortedInsertLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        traverseLLRecursive(head);

        // Sorted Insert
        Node newHead = sortedInsert(head, 25);
        traverseLLRecursive(newHead);
    }

    static Node sortedInsert(Node head,int val){
        Node temp = new Node(val);
        if (head == null)
            return temp;
        if(val < head.data){
            temp.next = head;
            return temp;
        }
            
        Node curr = head;
        while (curr.next != null && curr.next.data < val){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
